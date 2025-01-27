package com.in5minutes.learn_jpa_and_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in5minutes.learn_jpa_and_hibernate.course.Course;
import com.in5minutes.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.in5minutes.learn_jpa_and_hibernate.course.jpa.CourseSpringDataJpaRespository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner  {
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRespository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1,"Learn","in 2min"));
		repository.save(new Course(2,"Learn2","in 2min"));
		repository.save(new Course(3,"Learn3","in 2min"));
		repository.save(new Course(4,"Learn4","in 2min"));
		
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		
		System.out.println(repository.findByAuthor("in 2min"));
	}

}
