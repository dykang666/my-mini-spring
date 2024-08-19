package org.springframework.context;

import org.springframework.context.event.ApplicationEvent;

import java.util.EventListener;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 17:36
 */
public interface ApplicationListener<E extends ApplicationEvent>  extends EventListener {
    void onApplicationEvent(E event);
}
