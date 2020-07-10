package com.nero.java.jsp;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @created nero
 * @date 2018/9/18 17:47
 */
public class FilterDemo implements Filter {
    //初始化方法，只在应用启动时运行一次
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(filterConfig.getInitParameter("name"));
        System.out.println(filterConfig.getInitParameter("age"));
    }

    //过滤器的主要逻辑写在方法
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println(((HttpServletRequest)request).getRequestURL());
        chain.doFilter(request, response);//将请求传入过滤链，请求会继续通过其他过滤器(若有)到达servlet
    }

    @Override
    public void destroy() {

    }
}
