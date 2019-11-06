package MVC_Model.Practice.customers.controller;

import MVC_Model.Practice.customers.model.Customer;
import MVC_Model.Practice.customers.service.CustomerService;
import MVC_Model.Practice.customers.service.CustomerServiceImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createCustomer(request,response);
                break;
            case "edit":
                editCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                break;
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int ID = Integer.parseInt(request.getParameter("ID"));
        Customer customer = this.customerService.findByID(ID);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        else {
            this.customerService.remove(ID);
            try {
                response.sendRedirect("/customers");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) {
        int ID = Integer.parseInt(request.getParameter("ID"));
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        Customer customer = this.customerService.findByID(ID);
        RequestDispatcher dispatcher;
        if (customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        else{
            customer.setName(name);
            customer.setAddress(address);
            customer.setEmail(email);
            this.customerService.update(ID,customer);
            request.setAttribute("customerInfo",customer);
            request.setAttribute("message","Customer information was updated");
            dispatcher = request.getRequestDispatcher("MVC_Model/Practice/customer/edit.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int ID = (int)(Math.random()*1000);
        Customer customer = new Customer(ID,name,email,address);
        this.customerService.save(customer);
        RequestDispatcher dispatcher = request.getRequestDispatcher("MVC_Model/Practice/customer/create.jsp");
        request.setAttribute("message","New customer was created !!!");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showCreateForm(request,response);
                break;
            case "edit":
                showEditForm(request,response);
                break;
            case "delete":
                showDeleteForm(request, response);
                break;
            case "view":
                showViewForm(request,response);
            default:
                listCustomers(request, response);
                break;
        }
    }

    private void showViewForm(HttpServletRequest request, HttpServletResponse response) {
        int ID = Integer.parseInt(request.getParameter("ID"));
        Customer customer = this.customerService.findByID(ID);
        RequestDispatcher dispatcher;
        if(customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        else{
            request.setAttribute("customerInfo", customer);
            dispatcher = request.getRequestDispatcher("MVC_Model/Practice/customer/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showDeleteForm(HttpServletRequest request, HttpServletResponse response) {
        int ID = Integer.parseInt(request.getParameter("ID"));
        Customer customer = this.customerService.findByID(ID);
        RequestDispatcher dispatcher;
        if (customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        else{
            request.setAttribute("customerInfo", customer);
            dispatcher = request.getRequestDispatcher("MVC_Model/Practice/customer/delete.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        int ID = Integer.parseInt(request.getParameter("ID"));
        Customer customer = this.customerService.findByID(ID);
        RequestDispatcher dispatcher ;
        if (customer == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }
        else{
            request.setAttribute("customerInfo",customer);
            dispatcher = request.getRequestDispatcher("MVC_Model/Practice/customer/edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("MVC_Model/Practice/customer/create.jsp");
        try{
            dispatcher.forward(request,response);
        }
        catch (ServletException | IOException e){
            e.printStackTrace();
        }
    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers= this.customerService.findAll();
        request.setAttribute("ListCustomer",customers);
        RequestDispatcher dispatcher = request.getRequestDispatcher("MVC_Model/Practice/customer/list.jsp");
        try{
            dispatcher.forward(request,response);
        }
        catch (ServletException | IOException e){
            e.printStackTrace();
        }
    }
}
