package com.spring.core.chap02_3.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository repository;

    @Autowired // 생성자가 하나면 안 써도 상관 없지만 명시적으로 표현
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public String findProduct() {
        return "데이터 가져오기";
    }
}
