package com.spring.core.chap02_2.practice.q1;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    private String title;
    private String author;
}