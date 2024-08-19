package org.springframework.beans.factory.config;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:  单例注册表
 * @date 2024/8/3 11:03
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);
}
