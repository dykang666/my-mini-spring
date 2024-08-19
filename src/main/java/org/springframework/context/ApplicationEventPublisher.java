package org.springframework.context;

import org.springframework.context.event.ApplicationEvent;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 18:04
 */
public interface ApplicationEventPublisher {
    /**
     * 发布事件
     *
     * @param event
     */
    void publishEvent(ApplicationEvent event);
}
