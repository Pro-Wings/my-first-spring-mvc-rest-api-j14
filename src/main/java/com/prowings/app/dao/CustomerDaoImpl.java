package com.prowings.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.app.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	private SessionFactory sessionFactory;

	public CustomerDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void addCustomerToDb(Customer customer) {
		sessionFactory.getCurrentSession().persist(customer);
	}

}
