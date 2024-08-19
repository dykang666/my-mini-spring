package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/9 18:02
 */
public interface ObjectFactory<T> {
    T getObject() throws BeansException;
}
