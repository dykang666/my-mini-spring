package org.springframework.context;

import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.core.io.ResourceLoader;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/4 17:17
 */
public interface ApplicationContext  extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader,ApplicationEventPublisher{
}
