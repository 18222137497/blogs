package cn.wangjing921.config.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 * @author afflatus
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override//方法执行之前，判断是否放行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        Object loginUser = request.getSession().getAttribute("loginUser");
//        if (loginUser==null){
//            request.setAttribute("msg","请先登录");
//            request.getRequestDispatcher("/login").forward(request,response);
//            return false;
//        }else {
//            return true;
//        }
        return true;
    }

    @Override//方法执行之后
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override//页面加载之后
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
