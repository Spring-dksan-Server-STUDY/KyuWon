package com.dksanServer.kyuwon;

import com.dksanServer.kyuwon.assignment1.Person;
import com.dksanServer.kyuwon.assignment1.Professor;
import com.dksanServer.kyuwon.assignment1.Student;
import com.dksanServer.kyuwon.week1.Generic;
import com.dksanServer.kyuwon.week1.Server;
import com.dksanServer.kyuwon.week1.User;
import com.dksanServer.kyuwon.week1.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KyuwonApplication {

	public static void main(String[] args) {
		SpringApplication.run(KyuwonApplication.class, args);

		User user = new User(1, "김규원", "서버");
		user.introduce();

		user.setName("양지영");
		user.setPart("안드로이드");

		String name = user.getName();
		System.out.println(name);

		user.introduce();

		// interface
		UserServiceImpl userService = new UserServiceImpl();
		String club = userService.CLUB;
		System.out.println(club);

		userService.introduce("김규원",23, "istp");
		userService.getInfo(31, "server");
		userService.getSOPT();

		// inheritance
		Server server = new Server("김규원", "스프링");
		String name2 = server.getName();
		String language = server.getStudy();

		System.out.println(name2);
		System.out.println(language);

		server.test();

		// generic
		Generic<String> generic1 = new Generic<>("규원");
		Generic<Integer> generic2 = new Generic<>(23);

		generic1.printData();
		generic2.printData();

		// assignment1
		Person person = new Person("김규원");
		System.out.println(person.className + " 과목 입니다!");
		person.introduce();
		person.introduceMajor("신소재");
		person.sayHello();

		Student student = new Student("최학생", "2018170217");
		System.out.println("학번 " + student.getStudentId() + " 이름 " + student.getName());
		System.out.println(student.className + " 과목 입니다!");
		student.introduce();
		student.introduceMajor("신소재");
		student.sayHello();

		Professor professor = new Professor("박교수", "1990289281");
		System.out.println("교직원 학번 " + professor.getProfessorId() + " 이름 " + professor.getName());
		System.out.println(professor.className + " 과목 입니다!");
		professor.introduce();
		professor.introduceMajor("신소재");
		professor.sayHello();
	}

}
