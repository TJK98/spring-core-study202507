package com.spring.core.chap02_2.vehicle;

import org.springframework.stereotype.Component;

//@Component
public class Car {

    // 의존 객체 설정
    private final Engine engine;

    // 생성자 주입 - 생성자를 통해 의존객체 엔진을 받아서 결합

    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("자동차가 생성됨");
    }

    // setter 주입 - setter를 통해 의존 객체를 전달 받아 결합
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    public void drive() {
        engine.start();
        System.out.println("자동차가 달립니다.");
    }
}