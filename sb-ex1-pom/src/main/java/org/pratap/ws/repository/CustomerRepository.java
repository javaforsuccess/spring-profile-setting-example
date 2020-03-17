package org.pratap.ws.repository;

import org.pratap.ws.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {

}