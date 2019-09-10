package com.hungryTripperDemo.service;

import com.hungryTripperDemo.modal.Customer;


public interface CustomerService {
	public String saveCustomer(Customer customer)throws Exception;

	public String UpdateCustomer(Customer customer) throws Exception;
	
	

}
