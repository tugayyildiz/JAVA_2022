package dataAccess;

import entities.Instructor;

public class HibernateInstructorDao implements IInstructor {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate eðitmen eklendi." + instructor.getName());
		
	}

}
