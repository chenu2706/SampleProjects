package com.hungryTripperDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hungryTripperDemo.DAO.CustomerDAO;
import com.hungryTripperDemo.modal.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO custDao;
	
	/*@Autowired
	private CustomerRepository customerRepository;*/

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

	/*@Override
	public boolean isUserAlreadyPresent(CustomerForm customerForm) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}*/
	
	/*@Override
	public boolean isUserAlreadyPresent(CustomerForm customerFrom) throws Exception
	{
		boolean isCustomerExist = false;
		
		CustomerForm existingUser = customerRepository.findByEmail(customerFrom.getEmail());

		if(existingUser !=null)
		{
			isCustomerExist = true;
		}
		return isCustomerExist;
		
	}*/

}
