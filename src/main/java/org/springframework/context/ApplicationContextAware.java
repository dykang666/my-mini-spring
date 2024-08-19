package org.springframework.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 16:16
 */
public interface ApplicationContextAware   extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
