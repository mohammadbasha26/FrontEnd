package com.niit.DAO;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO 
  {
	public void addCategory (Category category);
	public static void deleteCategory (int categoryID) {
		// TODO Auto-generated method stub
		
	}
	public void updateCategory (int categoryID);
	public Category getCategory (int categoryId);

	
	
	public List<Category>getCategories();
	}

