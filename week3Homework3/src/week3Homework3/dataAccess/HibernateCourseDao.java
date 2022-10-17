package week3Homework3.dataAccess;

import week3Homework3.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Kurs Hybernate'e eklendi");
	}

}
