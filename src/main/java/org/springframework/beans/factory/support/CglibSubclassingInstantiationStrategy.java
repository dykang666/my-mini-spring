package org.springframework.beans.factory.support;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;


/**
 * @author kangdongyang
 * @version 1.0
 * @description:  cglib实例化策略
 * @date 2024/8/3 15:54
 */
public class CglibSubclassingInstantiationStrategy  implements InstantiationStrategy{
    /**
     * 使用CGLIB动态生成子类
     *
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(beanDefinition.getBeanClass());
//        enhancer.setCallback((MethodInterceptor) (obj, method, argsTemp, proxy) -> proxy.invokeSuper(obj,argsTemp));
//        return enhancer.create();

        //TODO 感兴趣的小伙伴可以实现下
     throw new UnsupportedOperationException("CGLIB instantiation strategy is not supported");
    }
}
