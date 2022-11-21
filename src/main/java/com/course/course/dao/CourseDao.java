package com.course.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.course.entities.Course;


public interface CourseDao extends JpaRepository<Course,Long>{

}
