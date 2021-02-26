package cn.wangjing921.config;

import cn.wangjing921.service.security.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/**
 * springSecurity配置类
 * @author afflatus
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)//全局方法拦截
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    LoginService userDetailsService;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    /**
     * 授权
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //请求授权的规则,设置必须登录
        http.authorizeRequests()
                .antMatchers("/toLogin").permitAll()
//                .antMatchers("/").permitAll()
                .antMatchers("/**").hasAnyRole("普通用户","管理员","VIP")
        ;

        //没有权限默认去登录页面,需要开启登录的页面
        http.formLogin()
//                .loginPage("/login.html")//设置登录页面
                .loginProcessingUrl("/toLogin")//自定义登录接口
                .defaultSuccessUrl("/main")//指定登录页面
        ;
        //开启注销
        http.logout()
                .logoutSuccessUrl("/toLogin");//注销成功挑战那个页面
        //防止网站工具 ： get post
        http.csrf().disable();//关闭csrf跨域，默认是开启的

        //开启记住我功能 cookie 默认保存两周
        http.rememberMe()
                .rememberMeParameter("remember")//设置记住我的name的别名
        ;
    }

    /**
     * 静态资源放行
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/**");
    }

    /**
     * 注入加密类
     * @return
     */
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    /**
     * 认证
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);

    }

}