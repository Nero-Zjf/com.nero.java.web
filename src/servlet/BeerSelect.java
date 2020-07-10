package com.nero.java.jsp.servlet;

import com.nero.java.jsp.domain.Dog;
import com.nero.java.jsp.service.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * servlet控制器
 *
 * @created nero
 * @date 2018/9/4 15:04
 */
public class BeerSelect extends HttpServlet {

    private static String email;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String c = req.getParameter("color");
        BeerExpert beerExpert = new BeerExpert();
        List result = beerExpert.getBrands(c);
        req.setAttribute("styles", result);
        req.setAttribute("email", email);
        //将Dog对象设置到session的Attribuite中
        Dog dog = new Dog();
        dog.setName(email);
        req.getSession().setAttribute("email", dog);
        resp.addCookie(new Cookie("email", email));
//        RequestDispatcher view = req.getRequestDispatcher("jsp/result.jsp");
        RequestDispatcher view = getServletContext().getRequestDispatcher("/jsp/result.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        ServletContext servletContext = getServletContext();
        email = getInitParameter("email");
        super.init();
    }

}
