package org.springframework.aop;

import org.aopalliance.aop.Advice;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/7 11:57
 */
public interface Advisor {
    Advice getAdvice();

}
