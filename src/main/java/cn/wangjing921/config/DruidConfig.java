package cn.wangjing921.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.HashMap;
/**
 * 德鲁伊配置类
 * @author afflatus
 */
@Configuration
public class DruidConfig {

    @Value("${druidUsername}")
    private String druidUsername;
    @Value("${druidPassword}")
    private String druidPassword;

    //装入容器，并载入配置
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }
    //后台监控功能
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        //后台需要有人登录，账号密码配置
        HashMap<String, String> initParameters = new HashMap<>();
        //增加配置
        initParameters.put("loginUsername",druidUsername);
        initParameters.put("loginPassword",druidPassword);
        //允许谁可以访问
        initParameters.put("allow","");//空为谁都可以访问，localhost表示只有本机可以访问
        //禁止谁访问
        initParameters.put("deny","192.168.1.1");

        bean.setInitParameters(initParameters);//设置初始化参数
        return bean;
    }

    //filter过滤器，表示访问什么资源时候不会控制台监控记录
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());//设置过滤器相关配置的类
        //可以过滤那些请求呢？
        HashMap<String, String> initParameters = new HashMap<>();
        //这些东西不进行统计
        initParameters.put("exclusions","*.js,*.css,/druid/*");
        bean.setInitParameters(initParameters);
        return bean;
    }
}