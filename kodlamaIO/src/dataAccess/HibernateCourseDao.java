package dataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourse {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate kurs eklendi." + course.getName());
		
	}

}
