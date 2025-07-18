package com.spring.core.chap02_4.repository;

import com.spring.core.chap02_4.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("smr") // 이름 지정 가능
public class StudentMeomoryRepository implements StudentRepository {
    @Override
    public void save(Student student) {
        // ... 생략
    }

    @Override
    public List<Student> findAll() {
        System.out.println("# 학생 정보를 메모리에서 로딩합니다.");
        return List.of(
                new Student("001", "뽀로로", "F")
                , new Student("002", "삐로로", "A")
                , new Student("003", "뿌로로", "C")
        );
    }
}
