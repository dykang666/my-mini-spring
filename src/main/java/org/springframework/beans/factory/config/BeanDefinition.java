package org.springframework.beans.factory.config;

import org.springframework.beans.PropertyValues;

/**
 * @author kangdongyang
 * @version 1.0
 * @description: BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、是否为单例等，此处简化只包含class类型
 * @date 2024/8/3 11:01
 */
public class BeanDefinition {
    public static String SCOPE_SINGLETON = "singleton";

    public static String SCOPE_PROTOTYPE = "prototype";

    private Class beanClass;
    private PropertyValues propertyValues;
    private String initMethodName;

    private String destroyMethodName;
    private String scope = SCOPE_SINGLETON;
    private boolean prototype = false;
    private boolean singleton = true;

    /*
    懒加载
     */
    private boolean lazyInit=false;

    public boolean isSingleton() {
        return this.singleton;
    }
    public void setScope(String scope) {
        this.scope = scope;
        this.singleton = SCOPE_SINGLETON.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }
    public boolean isPrototype() {
        return this.prototype;
    }

    public BeanDefinition(Class beanClass) {
        this(beanClass, null);
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }


    public Class getBeanClass()
    {
        return beanClass;
    }

    public void setBeanClass(Class beanClass)
    {
        this.beanClass = beanClass;
    }
    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }


    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }
    public String getInitMethodName() {
        return initMethodName;
    }
    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }
    public String getDestroyMethodName() {
        return destroyMethodName;
    }
    public void setLazyInit(boolean b){
        lazyInit=b;
    }

    public boolean isLazyInit(){
        return lazyInit;
    }

}
