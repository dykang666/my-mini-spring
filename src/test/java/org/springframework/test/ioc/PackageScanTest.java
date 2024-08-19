package org.springframework.test.ioc;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.bean.Car;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/7 17:21
 */
public class PackageScanTest {
    @Test
    public void testScanPackage() throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:package-scan.xml");
        Car car = applicationContext.getBean("car", Car.class);
        assertThat(car).isNotNull();
    }
}
