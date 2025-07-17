package com.spring.core.chap01.manage;

import com.spring.core.chap01.*;

// 호텔의 레스토랑 입점과 헤드 쉐프 고용은 호텔 메니저가 다 책임진다.
public class HotelManager {

    // 셰프를 고용하는 기능 - 셰프 객체 생성을 위임
    public Chef chef() {
        return new JannChef();
    }

    // 코스를 개발하는 기능
    public Course course() {
        return new FrenchCourse();
    }

    // 레스토랑을 입점하는 기능
    public Restaurant restaurant() {
        return new WesternRestaurant(chef(), course());
    }

    // 호텔의 의존객체를 조립해주는 기능
    public Hotel hotel() {
        return new Hotel(restaurant(), chef());
    }

}