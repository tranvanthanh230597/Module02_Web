package MVC_Model.Practice.customers.service;

import MVC_Model.Practice.customers.model.Customer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        customers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        customers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        customers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        customers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getID(),customer);
    }

    @Override
    public Customer findByID(int ID) {
        return customers.get(ID);
    }

    @Override
    public void update(int ID, Customer customer) {
        customers.put(ID, customer);
    }

    @Override
    public void remove(int ID) {
        customers.remove(ID);
    }
}
