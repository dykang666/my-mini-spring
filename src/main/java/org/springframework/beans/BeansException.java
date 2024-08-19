package org.springframework.beans;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/3 11:58
 */
public class BeansException  extends RuntimeException{
    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
