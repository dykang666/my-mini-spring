package org.springframework.beans.factory;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 17:12
 */
public interface FactoryBean<T> {
    T getObject() throws Exception;
    boolean isSingleton();
}
