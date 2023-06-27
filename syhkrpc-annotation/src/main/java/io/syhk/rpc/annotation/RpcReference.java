package io.syhk.rpc.annotation;


import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author syhk
 * @description syhkrpc 服务消费者注解
 */

@Target({ElementType.FIELD}) // ElementType.FIELD 表示该注解只能被用在字段上
@Retention(RetentionPolicy.RUNTIME)
@Autowired
public @interface RpcReference {

    /**
     * 版本号
     * @return
     */
    String version() default "1.0.0";


    /**
     * 注册中心类型，默认为 zookeeper包含 nacos  etcd  consul
     * @return
     */
    String registryType() default "zookeeper";


    /**
     * 注册中心地址，默认为本地
     * @return
     */
    String registryAddress() default "127.0.0.1:2181";


    /**
     * 负载均衡类型，默认基于 ZK 的一致性 Hash
     * @return
     */
    String loadBalanceType() default  "zkconsistenthash";


    /**
     *  序列化类型，目前的类型包含： protostuff, kryo, json, jdk, hessian2, fst
     * @return
     */
    String serializationType() default "protostuff";


    /**
     * 超时时间，默认为 5s
     * @return
     */
    long timeout() default  5000;


    /**
     * 是否异步调用
     * @return
     */
    boolean async() default false;


    /**
     * 是否单向调用
     * @return
     */
    boolean oneway() default  false;

    /**
     * 代理的类型，默认是 jdk ; javassist 代理   cglib 代理
     * @return
     */
    String proxy() default  "jdk";


    /**
     * 服务分组，默认为空
     * @return
     */
    String group() default  "";


}
