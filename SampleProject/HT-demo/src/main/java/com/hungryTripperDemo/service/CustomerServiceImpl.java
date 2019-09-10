package com.hungryTripperDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungryTripperDemo.DAO.CustomerDAO;
import com.hungryTripperDemo.modal.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO custDao;

	@Override
	public String saveCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return custDao.saveCustomer(customer);
	}
	
	@Override
	public String UpdateCustomer(Customer customer) throws Exception
	{
		
		return custDao.UpdateCustomer(customer);
	}

}
