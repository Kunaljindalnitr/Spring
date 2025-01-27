package com.in5minutes.learn_jpa_and_hibernate.course.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in5minutes.learn_jpa_and_hibernate.course.Course;

public interface CourseSpringDataJpaRespository extends JpaRepository<Course,Long> {
	
	List<Course> findByAuthor(String author);
	
}
