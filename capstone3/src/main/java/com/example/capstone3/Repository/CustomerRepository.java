package com.example.capstone3.Repository;

import com.example.capstone3.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {


    Customer findCustomerById(Integer id);

    // Abdullah Ali1
    Customer findCustomerByEmail(String email);



}
