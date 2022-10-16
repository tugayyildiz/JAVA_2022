package business;

import java.util.ArrayList;
import java.util.List;

import dataAccess.ICategoryDao;
import entities.Category;

public class CategoryManager {

	ICategoryDao icategoryDao;
	
    List<Category> categories = new ArrayList<>();


	public CategoryManager(ICategoryDao categoryDao) {
		super();
		this.icategoryDao = categoryDao;
	}
	
	public void add (Category category) throws Exception {
		
			for(Category i : categories) {
				
				if(category.getName() == i.getName()) {
					 throw new Exception("Kurs ismi tekrar edemez.");
				}
				
			}
		categories.add(category);
		icategoryDao.add(category);
	}
	
	
}
