package com.hungryTripperDemo.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hungryTripperDemo.modal.Customer;
import com.hungryTripperDemo.repo.CustomerRepository;

@Component
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public String saveCustomer(Customer customer)throws Exception {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return "Data Saved Successfully";
	}
	
	@Override
	public String UpdateCustomer(Customer customer) throws Exception
	{
		customerRepository.save(customer);
		return "Data Updated Successfully";
	}

	
}
