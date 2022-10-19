package com.dksanServer.kyuwon.assignment1;

public class Person implements PersonInterface{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void introduce() {
        System.out.println("이름은 " + name +"입니다");
    }

    @Override
    public void introduceMajor(String major) {
        PersonInterface.super.introduceMajor(major);
    }

    public void sayHello(){
        PersonInterface.sayHello();
    }
}
