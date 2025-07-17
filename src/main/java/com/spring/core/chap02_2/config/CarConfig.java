package com.spring.core.chap02_2.config;

import com.spring.core.chap02_2.vehicle.Car;
import com.spring.core.chap02_2.vehicle.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링에게 관리할 객체를 알려주는 클래스
@Configuration // <- 이건 자바 클래스가 아니라 설정 파일이다.
public class CarConfig {

    // 스프링이 나 대신 엔진을 만든다.
    @Bean
    public Engine engine() {
        return new Engine();
    }

    // 스픵이 나 대신 차를 만든다. 대신 만들면 엔진을 결합한다.
    @Bean
    public Car car() {
        return new Car(engine()); // 생성자 주입
    }
}
