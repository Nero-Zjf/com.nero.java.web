package com.nero.java.jsp.servlet;

import com.nero.java.jsp.domain.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @created nero
 * @date 2018/9/6 9:28
 */
public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
//        customer.setName(req.getParameter("name"));
//        customer.setAge(Integer.parseInt(req.getParameter("age")));
        customers.add(customer);
        req.setAttribute("cust", customer);
        req.setAttribute("custs", customers);

        RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/welcome.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
