package org.springframework.test.common;

import org.springframework.core.convert.converter.Converter;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/8 15:55
 */
public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}
