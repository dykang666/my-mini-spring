package org.springframework.test.service;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/6 21:05
 */
public class WorldServiceImpl implements WorldService{
    private String name;
    @Override
    public void explode() {
        System.out.println("The Earth is going to explode");
    }

    @Override
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
