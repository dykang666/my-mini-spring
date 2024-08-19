package org.springframework.aop;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 21:08
 */
public class TargetSource {
    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }
    public Class<?>[] getTargetClass() {
        return this.target.getClass().getInterfaces();
    }

    public Object getTarget() {
        return this.target;
    }
}
