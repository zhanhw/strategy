package com.example.strategy.annotation;


import java.lang.annotation.*;

/**
 * 消息策略处理
 *
 * @author aw
 * @date 2021/1/13 15:20
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MessageHandel {

    /**
     * 执行
     *
     * @return
     */
    String value() default "";

}
