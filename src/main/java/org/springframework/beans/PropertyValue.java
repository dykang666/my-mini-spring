package org.springframework.beans;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:  bean属性信息
 * @date 2024/8/3 16:05
 */
public class PropertyValue {
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }



}
