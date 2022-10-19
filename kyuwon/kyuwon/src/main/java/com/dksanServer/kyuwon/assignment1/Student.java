// 1주차 과제 제출

package com.dksanServer.kyuwon.assignment1;

public class Student extends Person {
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void introduceMajor(String major) {
        System.out.println(major + "학과 학생 입니다");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
