package com.spring.core.chap02_3.repository;

import com.spring.core.chap02_3.model.MyModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// 데이터베이스에 접근해서 데이터를 CRUD하는 역할
//@Component // 스프링에게 빈 등록 (빈 정의)
@Repository // 이 클래스는 명시적으로 DB에 접근하는 클래스이다.
public class MyRepository {

    public MyRepository() {
        System.out.println("MyRepository객체 생성!");
    }

    // 데이터 조회
    public MyModel findData() {
        return new MyModel("DB에서 조회한 데이터입니다.");
    }
}
