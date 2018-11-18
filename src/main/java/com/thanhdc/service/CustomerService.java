package com.thanhdc.service;

import com.thanhdc.controller.CustomerServlet;
import com.thanhdc.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void  remove(int id);
}
