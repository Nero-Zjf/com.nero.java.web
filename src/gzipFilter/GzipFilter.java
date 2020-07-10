package com.nero.java.jsp.gzipFilter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * @created nero
 * @date 2018/9/19 9:38
 */
public class GzipFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String valid_encodings = ((HttpServletRequest) request).getHeader("Accpet-Encoding");
        if (valid_encodings.contains("gzip")) {
            ResponseWraper responseWraper = new ResponseWraper(resp);
            responseWraper.setHeader("Content-Encoding", "gzip");
            chain.doFilter(req, responseWraper);

            GZIPOutputStream gzos = responseWraper.getGZIPOutputStream();
            gzos.finish();

        } else {
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void destroy() {

    }
}
