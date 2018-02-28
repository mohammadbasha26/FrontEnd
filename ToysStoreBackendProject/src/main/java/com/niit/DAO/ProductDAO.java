package com.niit.DAO;

import java.util.List;


import com.niit.model.Product;

public interface ProductDAO {

	public void addProduct (Product product);
	public void deleteProduct (int ProductID);	
	public void updateProduct (int ProductID);	
	public void getProduct (int ProductID);	
	
	public List<Product>getProducts();

	
}
