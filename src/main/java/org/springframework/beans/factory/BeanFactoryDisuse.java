package org.springframework.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: bean工厂
 * @date 2024/8/3 10:51
 */
@Deprecated
public class BeanFactoryDisuse {
    private Map<String, Object> beanMap = new HashMap<>();
    public void registerBean(String name, Object bean) {
        beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return beanMap.get(name);
    }

}
