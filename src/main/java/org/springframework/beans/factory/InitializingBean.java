package org.springframework.beans.factory;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/5 19:31
 */
public interface InitializingBean {
    void afterPropertiesSet() throws Exception;
}
