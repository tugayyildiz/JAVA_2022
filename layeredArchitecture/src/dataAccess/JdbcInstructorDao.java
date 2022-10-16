package dataAccess;

import entities.Instructor;

public class JdbcInstructorDao implements IInstructor {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC eðitmen eklendi." + instructor.getName());
		
	}

}
