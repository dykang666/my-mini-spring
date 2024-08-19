package org.springframework.core.io;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: 资源加载器接口
 * @date 2024/8/3 17:12
 */
public interface ResourceLoader {
    Resource getResource(String location);
}
