package com.nero.java.jsp.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.FileSystem;

public class CodeReturn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        InputStream is = getServletContext().getResourceAsStream("/html/form.html");
        byte[] bytes = new byte[1024];
        int read = 0;
        OutputStream os = resp.getOutputStream();
        while ((read = is.read(bytes))!=-1) {
            os.write(bytes,0,read);
        }
        os.flush();
        os.close();
    }
}
