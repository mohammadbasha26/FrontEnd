package com.niit.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.SupplierDAO;
import com.niit.model.Supplier;

@Repository(value="supplierDAO")

public class SupplierImpl implements SupplierDAO 
{
	@Autowired
	SessionFactory sessionFactory;
	
	public void addSupplier(Supplier  supplier)
	
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();session.save(supplier);
		session.getTransaction().commit();
		session.close();
	}

	
	@Override
	public void deleteSupplier(int SupplierID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSupplier(int SupplierID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSupplier(int SupplierID) {
		// TODO Auto-generated method stub
		
	}


	
	

}
