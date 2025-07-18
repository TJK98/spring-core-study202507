package com.spring.core.chap02_3.service;

import com.spring.core.chap02_3.repository.MyRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// 데이터베이스에서 가져온 데이터를 정제하는 클래스
//@Component // 스프링에게 빈 등록 (빈 정의)
@Service
public class MyService {

    // 데이터베이스에 데이터를 가져오기 위해 의존관계
    private MyRepository repository;

    public MyService(MyRepository repository) {
        System.out.println("MyService 객체 생성");
        this.repository = repository;
        System.out.println("Repository 의존성이 Service에 주입");
    }

    public String processData() {
        return "데이터를 정제해서 전처리 ->" + repository.findData().getData();
    }
}
