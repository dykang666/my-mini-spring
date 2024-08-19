package org.springframework.core.convert.converter;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/8 17:06
 */
public interface ConverterFactory <S, R>{
    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
