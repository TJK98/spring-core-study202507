package com.spring.core.chap02_2.practice.q1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LibraryConfig {

    // 책 목록을 나대신 스프링이 만들어서 관리해줘
    @Bean
    public List<Book> books() {
        return List.of(
                new Book("캐치캐치 티니핑", "하츄핑"),
                new Book("뽀롱뽀롱 뽀로로", "삘리리"),
                new Book("반지의 제왕", "링링링")
        );
    }

    // 도서관도 나대신 만들어주고 책을 생성자로 주입해줘
    @Bean
    public Library library() {
        return new Library(books());
    }
}
