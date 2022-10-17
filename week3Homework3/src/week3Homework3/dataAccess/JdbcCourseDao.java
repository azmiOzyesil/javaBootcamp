package week3Homework3.dataAccess;

import week3Homework3.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Kurs JDBC'ye eklendi");
	}

}
