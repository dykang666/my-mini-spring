package org.springframework.context.event;

import org.springframework.context.ApplicationListener;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 17:34
 */
public interface ApplicationEventMulticaster {
    void addApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListener(ApplicationListener<?> listener);

    void multicastEvent(ApplicationEvent event);
}
