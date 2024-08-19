package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/7 12:01
 */
public interface MethodBeforeAdvice  extends BeforeAdvice {
    void before(Method method, Object[] args, Object target) throws Throwable;
}
