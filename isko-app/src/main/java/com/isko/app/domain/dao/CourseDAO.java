package com.isko.app.domain.dao;

import java.util.List;

import com.isko.app.domain.Course;

public interface CourseDAO 
{
	int insertCourse(Course course);

	int updateCourse(Course course);

	Course findCourseByCourseId();

	List<Course> findAllCourses();

}
