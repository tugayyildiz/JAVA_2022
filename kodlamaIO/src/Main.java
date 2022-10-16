import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCategoryDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Instructor instructor = new Instructor(1,"Engin","Demiroð");
        Category category = new Category(1,"Backend");
        Course course = new Course(1,"Java","Java baþlýk","Java açýklama",99,5);
      

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao());
        instructorManager.add(instructor);

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
        categoryManager.add(category);

   

        CourseManager courseManager = new CourseManager(new HibernateCourseDao());
        courseManager.add(course);

       

	}

}
