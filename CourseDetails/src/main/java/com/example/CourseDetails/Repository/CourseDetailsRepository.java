package com.example.CourseDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CourseDetails.entity.CourseDetails;

@Repository
public interface CourseDetailsRepository extends JpaRepository<CourseDetails, Long>{
	
}
