package com.spring.core.chap02_3.controller;

import com.spring.core.chap02_3.config.MyModelConfig;
import com.spring.core.chap02_3.repository.MyRepository;
import com.spring.core.chap02_3.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void test() {

//        MyController controller = new MyController(new MyService(new MyRepository())); // 이건 스프링에서 맡긴다

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyModelConfig.class);

        MyController controller = context.getBean(MyController.class);

        controller.handleRequest();
    }

}