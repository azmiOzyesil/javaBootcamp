package week3Homework3.dataAccess;

import week3Homework3.entities.Category;

public class JdbcCategoryDao implements CategoryDao	{

	@Override
	public void add(Category category) {
		System.out.println("Kategori JDBC'ye eklendi");
	}

}
