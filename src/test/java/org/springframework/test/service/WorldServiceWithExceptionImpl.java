package org.springframework.test.service;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/8/7 11:43
 */
public class WorldServiceWithExceptionImpl  implements WorldService{
    @Override
    public void explode() {
        System.out.println("The Earth is going to explode with an Exception");
        throw new RuntimeException();
    }

    @Override
    public String getName() {
        return null;
    }
}
