package org.springframework.aop;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/7 11:50
 */
public interface PointcutAdvisor extends Advisor {
    Pointcut getPointcut();
}
