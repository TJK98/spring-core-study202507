package com.spring.core.chap02_2.vehicle;

import com.spring.core.SpringCore202507Application;
import com.spring.core.chap02_2.config.CarConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void test1() {

        // 스프링은 등록된 모든 객체를 Bean이라는 개념으로 관리하며
        // 객체의 생성과 소멸까지의 모든 생애주기를 스프링이 통합관리 운영함
        // 운영하는 커다란 창고 ApplicationContext라고 부름

//        Car car = new Car(new Engine()); // <- 이건 스프링의 방식이 아니다.

        ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

        Car car = context.getBean(Car.class);
        car.drive();
    }

}