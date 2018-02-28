package com.niit.DAO;

import java.util.List;

import com.niit.model.Supplier;




public interface SupplierDAO {
	
	public void addSupplier ( Supplier supplier);
	public void deleteSupplier (int SupplierID);	
	public void updateSupplier (int SupplierID);	
	public void getSupplier (int SupplierID);
	
	public List<Supplier>getSuppliers();

		
	}


