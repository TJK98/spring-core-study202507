package com.spring.core.chap02_3.practice;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    public String findProduct() {
        return "상품 데이터";
    }
}
