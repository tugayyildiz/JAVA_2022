package business;

import java.util.ArrayList;
import java.util.List;

import dataAccess.ICourse;
import entities.Course;

public class CourseManager {

	ICourse icourse;
	
    List<Course> courses = new ArrayList<>();

	
	public CourseManager(ICourse course) {
		super();
		this.icourse = course;
	}



	public void add(Course courseObject) throws Exception {
	
		for (Course i : courses) {
			
			if(courseObject.getName() == i.getName()) {
				 throw new Exception("Kurs ismi tekrar edemez.");
			}
			
			else if(i.getPrice() < 0) {
				 throw new Exception("Kurs fiyatý 0'dan küçük olamaz.");
			}
			
		}
		courses.add(courseObject);
		icourse.add(courseObject);
		
	}
	
	
}
