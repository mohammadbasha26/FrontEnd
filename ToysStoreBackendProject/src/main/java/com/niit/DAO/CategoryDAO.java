package com.niit.DAO;

import com.niit.model.Category;

public interface CategoryDAO 
  {
	public void addCategory (Category category);
	public void deleteCategory (Category category);
	public void updateCategory (Category category);
	public void getCategory (int categoryId);
	}
