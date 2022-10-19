package com.dksanServer.kyuwon.assignment1;

public class Professor extends Person{
    private String professorId;

    public Professor(String name, String professorId) {
        super(name);
        this.professorId = professorId;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    @Override
    public void introduceMajor(String major) {
        System.out.println(major + "학과 교수입니다");
    }
}
