package com.gmg.reflect;

/**
 * @author gmg
 * @title: MyRequestMapping
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2020/1/19 14:12
 */
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {
    /**
     * 表示访问该方法的url
     * @return
     */
    String uri() default "";

    String desc() default "";

}