package org.springframework.aop;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 20:45
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
