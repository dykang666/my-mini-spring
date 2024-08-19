package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:  实现该接口，能感知所属BeanFactory
 * @date 2024/8/6 16:18
 */
public interface BeanFactoryAware  extends Aware{
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
