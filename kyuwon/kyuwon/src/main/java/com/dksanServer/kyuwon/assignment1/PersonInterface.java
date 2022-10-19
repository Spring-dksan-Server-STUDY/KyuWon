package com.dksanServer.kyuwon.assignment1;

public interface PersonInterface {
    // 상수 메소드
    String className = "컴퓨터의 이해";

    // 추상 메소드
    void introduce();

    // 디폴트 메소드
    default void introduceMajor(String major){
        System.out.println( major + "입니다");
    }

    // 정적 메소드
    static void sayHello() {
        System.out.println("안녕하세요!");
    }
}
