package org.springframework.context.event;

import java.util.EventObject;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 17:35
 */
public abstract class ApplicationEvent extends EventObject {
    public ApplicationEvent(Object source) {
        super(source);
    }
}
