package business;

import dataAccess.IInstructor;
import entities.Instructor;

public class InstructorManager {

	IInstructor iInstructor;

	public InstructorManager(IInstructor iInstructor) {
		super();
		this.iInstructor = iInstructor;
	}
	
	public void add (Instructor instructor) {
		
	   	iInstructor.add(instructor);
	}

}
