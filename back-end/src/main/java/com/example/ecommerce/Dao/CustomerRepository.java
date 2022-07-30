package com.example.ecommerce.Dao;

import com.example.ecommerce.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}