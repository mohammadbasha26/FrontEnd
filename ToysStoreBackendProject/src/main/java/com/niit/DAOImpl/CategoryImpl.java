package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;
import com.niit.model.User;

@Repository(value="categoryDAO")
public class CategoryImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void addCategory(Category category) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.save(category);
session.getTransaction().commit();
session.close();
	
	}
	public void deleteCategory(Category category) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.delete(category);
session.getTransaction().commit();
session.close();
	
	}
	public void updateCategory(Category category) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.update(category);
session.getTransaction().commit();
session.close();
	
	}
	public Category getCategory(int categoryId) {

		Session session=sessionFactory.openSession();
session.beginTransaction(); session.get(Category.class, categoryId);
session.getTransaction().commit();
session.close();
return null;
	
	}
	
	public List<Category> getCategories()
	{
		Session session=sessionFactory.openSession();
		//session.beginTransaction();
		List<Category> clist=session.createQuery("from Category").getResultList();
		// TODO Auto-generated method stub
		session.close();

		return clist;
	}
	
	
	@Override
	public void updateCategory(int categoryID) {
		// TODO Auto-generated method stub
		
	}

}