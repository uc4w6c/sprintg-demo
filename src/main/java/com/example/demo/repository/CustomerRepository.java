package com.example.demo.repository;

import com.example.demo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	//@Query(value = "SELECT id,first_name,last_name FROM customers ORDER BY first_Name, last_Name", nativeQuery = true)
	
	@Query("SELECT X FROM Customer X ORDER BY firstName, lastName")
	List<Customer> findAllOrderByName();
}
