package com.example.demo.service;

import com.example.demo.domain.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	/*
	public List<Customer> findAll() {
		return customerRepository.findAllOrderByName();
	}
	
	public Customer findOne(Integer id) {
		return customerRepository.findOne(id);
	}
 	*/
	public Customer create(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Customer update(Customer customer) {
		return customerRepository.save(customer);
	}

	/*
	public Customer delete(Integer id) {
		return customerRepository.delete(id);
	}
	*/
}
