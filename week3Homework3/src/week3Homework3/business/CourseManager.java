package week3Homework3.business;

import java.util.ArrayList;
import java.util.List;

import week3Homework3.core.logger.Logger;
import week3Homework3.dataAccess.CourseDao;
import week3Homework3.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	public static List<String> courses = new ArrayList<>();

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void addCourse(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Course fiyatı 0'dan küçük olamaz.");
		}

		if (courses.contains(course.getCourseName())) {
			throw new Exception("Course ismi tekrar edemez");
		} else {
			System.out.println("Course eklendi : " + course.getCourseName());
			courses.add(course.getCourseName());
			courseDao.add(course);
			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
		}
	}
}
