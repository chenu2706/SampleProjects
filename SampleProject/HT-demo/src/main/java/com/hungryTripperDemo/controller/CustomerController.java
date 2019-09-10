package com.hungryTripperDemo.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hungryTripperDemo.form.CustomerForm;
import com.hungryTripperDemo.modal.Customer;
import com.hungryTripperDemo.modal.CustomerResponse;
import com.hungryTripperDemo.repo.CustomerRepository;
import com.hungryTripperDemo.service.CustomerService;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
	@Autowired
	private CustomerResponse response;

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CustomerRepository customerRepository;

	@RequestMapping(value = "/addcustomer", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody CustomerResponse saveCustomer(@Valid @RequestBody CustomerForm customerForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult.getAllErrors());
			response.setResponseCode("201");
			response.setResponseDesc("Error Occured");			
			return response;
		}
		try {
			Customer customer = new Customer();
			converFormtoDO(customerForm, customer);
			String respDesc = customerService.saveCustomer(customer);
			response.setResponseCode("200");
			response.setResponseDesc(respDesc);

		} catch (Exception e) {
			response.setResponseCode("201");
			response.setResponseDesc("Error Occured");
			return response;
		}
		return response;

	}

	/** This method is used to copy data from form to DO object
	 * @param customerForm
	 * @param customer
	 * @return
	 */
	private Customer converFormtoDO(CustomerForm customerForm, Customer customer) {
		// TODO Auto-generated method stub
		customer.setId(customerForm.getId());
		customer.setfirstName(customerForm.getfirstName());
		customer.setEmail(customerForm.getEmail());
		customer.setLastName(customerForm.getLastName());
		customer.setMobile_no(customerForm.getMobile_no());
		customer.setPassword(customerForm.getPassword());
		customer.setActive(customerForm.getActive());
		return customer;
	}

	
	  @RequestMapping(value="/getcustomer/{id}",method=RequestMethod.GET)
	  public Optional<Customer> getCustomerById(@PathVariable  int id )
	  {
		  return customerRepository.findById(id);
	   }
	  
	  @RequestMapping(value="/getcustomers",method=RequestMethod.GET)
	  public List<Customer> getAllCustomer() 
	  { 
		  return customerRepository.findAll(); 
		}
	  
	  @RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = "application/json")
		public @ResponseBody CustomerResponse updateCustomer(@Valid @RequestBody CustomerForm customerForm, BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				System.out.println(bindingResult.getAllErrors());
				response.setResponseCode("201");
				response.setResponseDesc("error Occured.Please check with the Validation");
				response.setAllError(bindingResult.getAllErrors());
				return response;
			}
			try {
				Customer customer = new Customer();
				converFormtoDO(customerForm, customer);
				String respDesc = customerService.UpdateCustomer(customer);
				response.setResponseCode("200");
				response.setResponseDesc(respDesc);

			} catch (Exception e) {
				response.setResponseCode("201");
				response.setResponseDesc("Error Occured");
				return response;
			}
			return response;

		}
	  
	  @RequestMapping("/deletecustomer/{id}") 
	  public String deleteCustomer(@PathVariable int id) 
	  { 
		  customerRepository.deleteById(id); 
		  return "Customer Deleted Successfully";
	  }
	 
}
