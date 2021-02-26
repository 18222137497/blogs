package cn.wangjing921.aspect;

import cn.wangjing921.annotation.VisitLog;
import cn.wangjing921.custenum.baseEnum.MethodActiveStateEnum;
import cn.wangjing921.domain.pojo.VisitLogBean;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 访问监控aop，负责记录发送日志
 * @author afflatus
 */
@Aspect
@Component
@Slf4j
public class VisitLogAspect {
    @Autowired
    RedisTemplate<String,String> redisTemplate;

    /**
     * 切入点
     */
    @Pointcut("execution(public * cn.wangjing921.controller..*(..))")
    public void myVisitLog(){
    }
    @Around("myVisitLog() && @annotation(visitLog)")
    public Object principalAround(ProceedingJoinPoint proceedingJoinPoint, VisitLog visitLog) throws Throwable{

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        String loginName = auth.getName();

        VisitLogBean visitLogBean = new VisitLogBean();

        Object rtValue = null;

        HttpServletRequest request=null;

        ValueOperations<String, String> stringValueOperations = redisTemplate.opsForValue();

        try {
            Object[] args = proceedingJoinPoint.getArgs();//得到方法执行所需的参数
            visitLogBean.setMethod(proceedingJoinPoint.getSignature().getName());//载入方法名
            request=(HttpServletRequest)args[args.length-1];//规定最后一个参数为Request
            log.info("记录访问,执行"+proceedingJoinPoint.getSignature().getName()+"方法");
            rtValue = proceedingJoinPoint.proceed(args);//明确调用业务层方法（切入点方法）
            visitLogBean.setState(MethodActiveStateEnum.SUCCEED);
            visitLogBean.setMsg("执行"+proceedingJoinPoint.getSignature().getName()+"方法，成功");//载入执行信息
            log.info("记录访问,"+proceedingJoinPoint.getSignature().getName()+"方法，成功");
            return rtValue;
        }catch (ClassCastException e){
            visitLogBean.setState(MethodActiveStateEnum.DEFEAT);
            visitLogBean.setMsg("类型转换异常!!!执行"+proceedingJoinPoint.getSignature().getName()+"方法，失败");//载入执行信息
            log.error("类型转换异常!!!记录访问,执行"+proceedingJoinPoint.getSignature().getName()+"方法，失败",e);
        } catch (Throwable throwable) {
            visitLogBean.setState(MethodActiveStateEnum.DEFEAT);
            visitLogBean.setMsg("执行"+proceedingJoinPoint.getSignature().getName()+"方法，失败");//载入执行信息
            log.error("记录访问,执行"+proceedingJoinPoint.getSignature().getName()+"方法，失败",throwable);
        } finally {
            log.info("记录访问完成");
        }
        //没有登录
        if (loginName==null){
            //网站访问量+1
            stringValueOperations.increment("loginVisitNumber");
        }else {
            visitLogBean.setIP(request.getRemoteAddr());
            visitLogBean.setUsername(loginName);
            //dubbo去调远程接口，直接将对象传输过去，注意序列化
        }
        //redis中存当日访问记录，凌晨12点归档
        return null;

    }
}
