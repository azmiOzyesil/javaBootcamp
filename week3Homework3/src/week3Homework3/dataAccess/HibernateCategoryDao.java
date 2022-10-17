package week3Homework3.dataAccess;

import week3Homework3.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori Hybernate'e eklendi");
	}

}
