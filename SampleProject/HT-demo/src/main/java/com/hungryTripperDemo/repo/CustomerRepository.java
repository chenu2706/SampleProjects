package com.hungryTripperDemo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hungryTripperDemo.modal.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{

	

}
