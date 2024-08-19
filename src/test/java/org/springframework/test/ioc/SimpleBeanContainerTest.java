package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactoryDisuse;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:  测试bean工厂
 * @date 2024/8/3 10:53
 */
@Deprecated
public class SimpleBeanContainerTest {
    @Test
    public void testGetBean() throws Exception {
        BeanFactoryDisuse beanFactory = new BeanFactoryDisuse();
        beanFactory.registerBean("helloService", new HelloService());
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
//        assertThat(helloService).isNotNull();
//        assertThat(helloService.sayHello()).isEqualTo("hello");
        helloService.sayHello();
    }

    class HelloService {
        public String sayHello() {
            System.out.println("hello");
            return "hello";
        }
    }
}
