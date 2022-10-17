package week3Homework3.dataAccess;

import week3Homework3.entities.Instructor;

public class HybernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor Hybernate'e eklendi");
	}

}
