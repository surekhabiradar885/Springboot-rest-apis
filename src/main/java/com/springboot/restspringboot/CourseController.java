package com.springboot.restspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn AWS","Amazon"),
				new Course(2,"Learn java","JavaPoint"),
		new Course(3,"Learn azure","Azure"));
	}

}
