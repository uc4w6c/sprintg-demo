package com.example.demo.repository;

import com.example.demo.domain.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	//@Query("SELECT X FROM Customer X ORDER BY x.firstName, x.lastName")
	@Query(value = "SELECT id,first_name,last_name FROM customers ORDER BY first_Name, last_Name", nativeQuery = true)
	Page<Customer> findAllOrderByName(Pageable pageable);
}