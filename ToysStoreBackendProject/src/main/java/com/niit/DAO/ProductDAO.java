package com.niit.DAO;

import com.niit.model.Product;

public interface ProductDAO {

	public void addProduct (Product product);
	public void deleteProduct (Product ProductID);	
	public void updateProduct (int ProductID);	
	public void getProduct (int ProductID);	

	
}
