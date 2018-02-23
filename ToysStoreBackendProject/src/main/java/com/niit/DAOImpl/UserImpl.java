package com.niit.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.UserDAO;
import com.niit.model.User;


	


	@Repository(value="userDAO")

	public  class UserImpl  implements UserDAO 
	
	{
		
			@Autowired
			SessionFactory sessionFactory;
			public void addUser(User user) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); session.save(user);
		session.getTransaction().commit();
		session.close();
			
			}

			public void deleteUser(int uid) {

				Session session=sessionFactory.openSession();
		 session.beginTransaction(); 
		 User user=getUser(uid);
		
		session.delete(user);
		session.getTransaction().commit();
		session.close();
			
			}

			
			public void updateUser(User user) {

				Session session=sessionFactory.openSession();
		session.beginTransaction(); 
		

		
				session.update(user);
		session.getTransaction().commit();
		session.close();
		
			}

		

			@Override
			public User getUser(int UserID) {
				// TODO Auto-generated method stub
				Session session=sessionFactory.openSession();
				session.beginTransaction(); 
				

				
						User u=session.get(User.class,UserID);
				session.getTransaction().commit();
				session.close();
				return u;
			}

			
	}
	
	
	


			
			

