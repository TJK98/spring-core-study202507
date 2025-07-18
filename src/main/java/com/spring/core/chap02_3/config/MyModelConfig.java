package com.spring.core.chap02_3.config;

import com.spring.core.chap02_3.controller.MyController;
import com.spring.core.chap02_3.repository.MyRepository;
import com.spring.core.chap02_3.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 해당 패키지 범위 안에서 @Component가 붙은 모든 클래스를 스캔하고 빈으로 등록한다.
@ComponentScan(basePackages = "com.spring.core.chap02_3")
public class MyModelConfig {

    // 빈등록 (빈 정의) : 스프링에게 관리를 위힘할 객체들을 지정
/*    @Bean
    public MyRepository repository() {
        return new MyRepository();
    }

    @Bean
    public MyService service() {
        return new MyService(repository());
    }

    @Bean
    public MyController controller() {
        return new MyController(service());
    }*/
}
