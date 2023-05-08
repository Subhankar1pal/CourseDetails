package com.example.CourseDetails.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CourseDetails {

	@Id
	long  courseId;
	
	String firstMajorSubject;
	String secondMajorSubject;
	String courseDescription;
	String optionalsubject;
}
