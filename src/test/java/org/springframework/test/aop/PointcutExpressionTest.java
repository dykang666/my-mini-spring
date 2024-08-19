package org.springframework.test.aop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.test.service.HelloService;

import java.lang.reflect.Method;

import static org.junit.Assert.assertThat;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 20:44
 */
public class PointcutExpressionTest {
    @Test
    public void testPointcutExpression() throws Exception {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut("execution(* org.springframework.test.service.HelloService.*(..))");
        Class<HelloService> clazz = HelloService.class;
        Method method = clazz.getDeclaredMethod("sayHello");
        Assertions.assertThat(pointcut.matches(clazz)).isTrue();
        Assertions.assertThat(pointcut.matches(method, clazz)).isTrue();
    }
}
