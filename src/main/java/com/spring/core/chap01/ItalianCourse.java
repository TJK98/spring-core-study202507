package com.spring.core.chap01;

public class ItalianCourse implements Course {
    @Override
    public void combineMenu() {
        System.out.println("====  이탈리안 코스 구성 ======");
    }
}