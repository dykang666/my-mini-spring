package org.springframework.core.convert.converter;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:  类型转换抽象接口
 * @date 2024/8/8 15:49
 */
public interface Converter<S, T>  {
    T convert(S source);
}
