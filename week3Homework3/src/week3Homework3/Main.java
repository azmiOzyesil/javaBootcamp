package week3Homework3;

import week3Homework3.business.CategoryManager;
import week3Homework3.business.CourseManager;
import week3Homework3.business.InstructorManager;
import week3Homework3.core.logger.DatabaseLogger;
import week3Homework3.core.logger.FileLogger;
import week3Homework3.core.logger.Logger;
import week3Homework3.core.logger.MailLogger;
import week3Homework3.dataAccess.HibernateCategoryDao;
import week3Homework3.dataAccess.HybernateInstructorDao;
import week3Homework3.dataAccess.JdbcCourseDao;
import week3Homework3.entities.Category;
import week3Homework3.entities.Course;
import week3Homework3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Instructor instructure = new Instructor("Engin Demiroğ");
		Course course1 = new Course("Java 2022", 9999);
		Course course2 = new Course("C# + Angular", 9999);
		Course course3 = new Course(".NET", 9999);

		Course course4 = new Course("Java 2022(ing)", 9999);
		Course course5 = new Course("C# + Angular(ing)", 9999);
		Course course6 = new Course(".NET(ing)", 9999);

		Category category1 = new Category("Yazılım");
		Category category2 = new Category("Software");

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager.addCategory(category1);
		categoryManager.addCategory(category2);

		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
		courseManager.addCourse(course3);
		courseManager.addCourse(course4);
		courseManager.addCourse(course5);
		courseManager.addCourse(course6);

		InstructorManager instructureManager = new InstructorManager(new HybernateInstructorDao(), loggers);
		instructureManager.addInstructor(instructure);
	}

}
