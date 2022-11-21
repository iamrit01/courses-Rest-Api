package com.course.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.course.dao.CourseDao;
import com.course.course.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
//	private List<Course> list;
	
	

//	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(121,"Core Java","Basics of Java"));
//		list.add(new Course(122,"Spring Boot","Basics of Rest Api's in Spring boot"));
//	}



	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return this.courseDao.findAll();
	}
	
	@Override
	public Course getCourse(long courseId) {
		return this.courseDao.getReferenceById(courseId);
	}



	@Override
	public Course  addCourse(Course course) {
		// TODO Auto-generated method stub
		this.courseDao.save(course);
		return course;
	}



	@Override
	public Course updateCourse(Course course) {
		this.courseDao.save(course);		
		return course;
	}



	@Override
	public void deleteCourse(long id) {
		Course c = this.courseDao.getReferenceById(id);
		this.courseDao.delete(c);
	}


}
