package org.springframework.beans.factory.config;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:  一个bean对另一个bean的引用
 * @date 2024/8/3 16:39
 */
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }

}
