package org.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 20:46
 */
public interface MethodMatcher {
    boolean matches(Method method, Class<?> targetClass);
}
