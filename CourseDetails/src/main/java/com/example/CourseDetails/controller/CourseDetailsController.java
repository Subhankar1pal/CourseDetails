package com.example.CourseDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.CourseDetails.entity.CourseDetails;
import com.example.CourseDetails.service.CourseDetailsService;

@RestController
public class CourseDetailsController {

	@Autowired
	CourseDetailsService courseDetailsService;
	
	@PostMapping(value = "/save/courseDetails")
	public void saveCourseDetails(@RequestBody CourseDetails courseDetails) {
		
		courseDetailsService.saveCourseDetails(courseDetails);
	}
	
	
	@GetMapping(value = "/get/courseDetailsById/{id}")
	public CourseDetails getCourseDetailsById(@PathVariable long id) {
		
		return courseDetailsService.getCourseDetailsbyId(id);
	}
}
