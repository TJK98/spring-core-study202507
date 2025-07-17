package com.spring.core.chap02_2.vehicle;

import org.springframework.stereotype.Component;

//@Component
public class Engine {

    public Engine() {
        System.out.println("엔진이 생성됨.");
    }

    public void start() {
        System.out.println("엔진 시동이 걸렸습니다.");
    }
}
