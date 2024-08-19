package org.springframework.test.common;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.test.bean.Car;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 17:11
 */
public class CarFactoryBean implements FactoryBean<Car> {
    private String brand;
    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        car.setBrand(brand);
        return car;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public boolean isSingleton() {
        return true;
    }
}
