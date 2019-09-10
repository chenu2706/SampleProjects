package com.hungryTripperDemo.DAO;

import com.hungryTripperDemo.modal.Customer;

public interface CustomerDAO {
	
	public String saveCustomer(Customer customer)throws Exception;

	public String UpdateCustomer(Customer customer) throws Exception; 
	
	

}
