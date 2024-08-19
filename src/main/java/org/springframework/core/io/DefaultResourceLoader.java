package org.springframework.core.io;

import org.springframework.context.event.ApplicationEvent;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/3 17:13
 */
public  class DefaultResourceLoader implements ResourceLoader{
    public static final String CLASSPATH_URL_PREFIX = "classpath:";

    @Override
    public Resource getResource(String location) {
        if (location.startsWith(CLASSPATH_URL_PREFIX)) {
            //classpath下的资源
            return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
        }else {
            try {
                //尝试当成url来处理
                URL url = new URL(location);
                return new UrlResource(url);
            } catch (MalformedURLException ex) {
                //当成文件系统下的资源处理
                return new FileSystemResource(location);
            }


        }
    }


}
