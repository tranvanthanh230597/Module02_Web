package MVC_Model.Practice.customers.service;

import MVC_Model.Practice.customers.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer>findAll();
    void save (Customer customer);
    Customer findByID(int ID);
    void update(int ID, Customer customer);
    void remove(int ID);
}
