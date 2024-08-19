package org.springframework.context;

import org.springframework.beans.BeansException;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/4 17:20
 */
public interface ConfigurableApplicationContext  extends ApplicationContext{

    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    /**
     * 关闭应用上下文
     */
    void close();


    /**
     * 向虚拟机中注册一个钩子方法，在虚拟机关闭之前执行关闭容器等操作
     */
    void registerShutdownHook();
}
