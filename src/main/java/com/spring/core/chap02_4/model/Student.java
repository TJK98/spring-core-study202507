package com.spring.core.chap02_4.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private String studentId; // 학번
    private String name; // 이름
    private String grade; // 학점
}
