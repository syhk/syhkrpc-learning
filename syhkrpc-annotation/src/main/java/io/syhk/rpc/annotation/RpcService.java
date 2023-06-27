package io.syhk.rpc.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author syhk
 * @description syhkrpc 服务提供者注解
 */
@Target({ElementType.TYPE}) // ElementType.TYPE 表示该注解只能被用在类上
@Retention(RetentionPolicy.RUNTIME)//这个注解的作用是用来标注注解的生命周期
@Component
public @interface RpcService {


    /**
     * 接口的 Class
     * @return
     */
    Class<?> interfaceClass() default void.class;


    /**
     * 接口的 ClassName
     * @return
     */
    String interfaceName() default "";


    /**
     * 版本号
     * @return
     */
    String version() default "1.0.0";

    /**
     * 分组
     * @return
     */
    String group() default  "";
}
