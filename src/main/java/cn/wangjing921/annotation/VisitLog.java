package cn.wangjing921.annotation;

import java.lang.annotation.*;

/**
 * 访问监控注解
 * @author afflatus
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface VisitLog {
}
