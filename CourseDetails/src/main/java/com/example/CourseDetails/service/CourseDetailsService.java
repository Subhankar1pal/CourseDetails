package com.example.CourseDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseDetails.Repository.CourseDetailsRepository;
import com.example.CourseDetails.entity.CourseDetails;

@Service
public class CourseDetailsService {

	@Autowired
	CourseDetailsRepository courseDetailsRepository;
	
	public CourseDetails getCourseDetailsbyId(long courseId) {
		
		return courseDetailsRepository.findById(courseId).get();
	}
	
	public void saveCourseDetails(CourseDetails courseDetails) {
		
		courseDetailsRepository.save(courseDetails);
	}
	
	
}
