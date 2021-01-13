package com.example.strategy.annotation;


import java.lang.annotation.*;

/**
 * 消息策略监听
 *
 * @author aw
 * @date 2021/1/13 15:20
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MessageListener {
}
