package com.prowings.app.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prowings.app.dao.CustomerDao;
import com.prowings.app.model.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;
	
	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	public void addCustomer(Customer customer) {
		customerDao.addCustomerToDb(customer);
	}

}
