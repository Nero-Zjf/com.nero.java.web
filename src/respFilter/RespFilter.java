package com.nero.java.jsp.respFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @created nero
 * @date 2018/9/19 10:50
 */
public class RespFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        wraper wraper = new wraper(resp);
        chain.doFilter(req, wraper);
        System.out.println(req.getRequestURL() + "----返回响应");
        resp.getWriter().print(wraper.toString());
    }

    @Override
    public void destroy() {

    }
}
