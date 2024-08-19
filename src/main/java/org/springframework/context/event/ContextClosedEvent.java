package org.springframework.context.event;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 17:52
 */
public class ContextClosedEvent extends ApplicationContextEvent {
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
