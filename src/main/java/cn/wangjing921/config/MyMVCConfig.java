package cn.wangjing921.config;

import cn.wangjing921.config.Interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * springmvc扩展类(未全盘接管)
 * @author afflatus
 */
@Configuration
public class MyMVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {//配置视图控制器
        registry.addViewController("/index").setViewName("login");
    }


    /**
     * 添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())//添加自定义拦截器
                .addPathPatterns("/**")//设置拦截的范围
                .excludePathPatterns("/","/login","/static/**");//设置不拦截的
    }

}