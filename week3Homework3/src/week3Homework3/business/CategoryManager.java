package week3Homework3.business;

import java.util.ArrayList;
import java.util.List;

import week3Homework3.core.logger.Logger;
import week3Homework3.dataAccess.CategoryDao;
import week3Homework3.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	public static List<String> categories = new ArrayList<>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void addCategory(Category category) throws Exception {
		if (categories.contains(category.getcategoryname()))
			throw new Exception("Kategori ismi zaten mevcut");
		else {
			categories.add(category.getcategoryname());
			categoryDao.add(category);
			System.out.println(category.getcategoryname() + " kategorilere eklendi.");
			for (Logger logger : loggers) {
				logger.log(category.getcategoryname());
			}
		}
	}
}
