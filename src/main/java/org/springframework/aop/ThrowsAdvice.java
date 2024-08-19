package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/7 11:25
 */
public interface ThrowsAdvice extends Advice {
    void throwsHandle(Throwable throwable, Method method, Object[] args, Object target);
}
