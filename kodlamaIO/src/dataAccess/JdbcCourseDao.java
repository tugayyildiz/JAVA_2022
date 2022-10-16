package dataAccess;

import entities.Course;

public class JdbcCourseDao implements ICourse {

	@Override
	public void add(Course course) {
		System.out.println("JDBC kurs eklendi." + course.getName());
		
	}

}
