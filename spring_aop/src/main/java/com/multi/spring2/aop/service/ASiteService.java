package com.multi.spring2.aop.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ASiteService implements ASiteInterface {
    public void tour() {
        System.out.println("view personal info -------");
    }

    @Override
    public void order() {
        System.out.println("order product ------ ");
    }

    @Override
    public void performTask() {
        // 실제 비즈니스 로직이 여기에 위치합니다.
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println(" performTask>> " + sum + " >> =================");
        try {
            Thread.sleep(2000); // 2초간 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void anotherTask() {
        // 실제 비즈니스 로직이 여기에 위치합니다.
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i;
        }
        System.out.println(" anotherTask>> " + sum + " >> =================");
        try {
            Thread.sleep(1000); // 1초간 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

