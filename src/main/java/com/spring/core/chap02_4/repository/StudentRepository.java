package com.spring.core.chap02_4.repository;

import com.spring.core.chap02_4.model.Student;

import java.util.List;

// 학생들을 모아서 관리할 저장소의 역할을 추상화
// 학생들을 잘 저장하여 조회, 생성, 수정, 삭제 로직을 처리
// 구체적으로 어디에 저장할건지는 상황에 따라 다르다.
public interface StudentRepository {

    // 학생 생성 기능
    void save(Student student);

    // 학생 목록 조회 기능
    List<Student> findAll();
}
