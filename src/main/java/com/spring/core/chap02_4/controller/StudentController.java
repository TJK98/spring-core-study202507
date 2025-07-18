package com.spring.core.chap02_4.controller;

import com.spring.core.chap02_4.model.Student;
import com.spring.core.chap02_4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

// 학생 조회 요청, 생성 요청을 처리
@Controller
// 스프링은 기본적으로 singleton으로 관리한다
// @Scope("prototype")로 하면 빈이 요청될 때마다 새로운 인스턴스를 생성한다. 하지만 실무적으론 스코프 프로토타입으로 스프링에게 맡기지 않는다.
public class StudentController {

    private StudentRepository repository;


    @Autowired // 스프링에서 의존성 주입을 자동으로 처리해주는 애너테이션
    // @Qualifier: 같은 타입의 여러 빈이 존재할 때, 어떤 빈을 주입할지 명시적으로 지정
    public StudentController(@Qualifier("smr") StudentRepository repository) {
        this.repository = repository;
    }

    // 조회 요청을 처리
    public void showStudents() {
        List<Student> studentList = repository.findAll();
        System.out.println("---------학생 목록 출력----------");
        studentList.forEach(System.out::println);
    }
}
