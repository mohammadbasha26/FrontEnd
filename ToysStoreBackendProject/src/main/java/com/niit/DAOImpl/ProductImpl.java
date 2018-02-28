	package com.niit.DAOImpl;

	import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;

	@Repository(value="productDAO")

	public class ProductImpl  implements ProductDAO 
	{
			@Autowired
			SessionFactory sessionFactory;

			public void addProduct(Product product) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.save(product);
		session.getTransaction().commit();
		session.close();
			
			}
			
		

			public void deleteProduct(Product product) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.save(product);
		session.getTransaction().commit();
		session.close();
			
			}

			public void updateProduct(Product product) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.save(product);
		session.getTransaction().commit();
		session.close();
			
			}
			public void getProduct(int ProductId) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.get(Product.class, ProductId);
		session.getTransaction().commit();
		session.close();
			
			
				
			}
			public List<Product> getProducts()
			{
				Session session=sessionFactory.openSession();
				//session.beginTransaction();
				List<Product> plist=session.createQuery("from Product").getResultList();
				// TODO Auto-generated method stub
				session.close();

				return plist;
			}



			@Override
			public void updateProduct(int ProductID) {
				// TODO Auto-generated method stub
				
			}



			@Override
			public void deleteProduct(int ProductID) {
				// TODO Auto-generated method stub
				
			}




		
	
	}


