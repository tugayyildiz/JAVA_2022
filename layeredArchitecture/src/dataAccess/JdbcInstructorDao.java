package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements IInstructor {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC e�itmen eklendi." + instructor.getName());
		
	}

}
