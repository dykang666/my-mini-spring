package org.springframework.context.event;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 18:06
 */
public class ContextRefreshedEvent extends ApplicationContextEvent{
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
