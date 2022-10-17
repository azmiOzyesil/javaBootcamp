package week3Homework3.business;

import week3Homework3.core.logger.Logger;
import week3Homework3.dataAccess.InstructorDao;
import week3Homework3.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void addInstructor(Instructor instructor) {
		System.out.println("Instructor eklendi: " + instructor.getName());
		instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
}
