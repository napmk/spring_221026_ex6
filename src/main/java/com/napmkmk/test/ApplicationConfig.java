package com.napmkmk.test;


import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration             
@ImportResource("classpath:appilcationCTX0.xml")
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("운동");
		hobbys.add("노래");
		hobbys.add("게임");
		
		Student student = new Student("홍길동", 30, hobbys);
		
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
		
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("영화");
		hobbys.add("체육");
		hobbys.add("야구");
		
		Student student = new Student("김유신", 23, hobbys);
		
		student.setHeight(176);
		student.setWeight(83);
		
		return student;
		
	}
}