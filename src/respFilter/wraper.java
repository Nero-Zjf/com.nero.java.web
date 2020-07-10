package com.nero.java.jsp.respFilter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @created nero
 * @date 2018/9/19 10:51
 */
public class wraper extends HttpServletResponseWrapper {
    CharArrayWriter caw;
    //包装传入的一个响应实例
    public wraper(HttpServletResponse response) {
        super(response);
        caw = new CharArrayWriter();
    }

    //重写此方法替换掉原PrintWriter，此处为CharArrayWriter，它将打印到内存中，因此不会直接输出响应到客户
    @Override
    public PrintWriter getWriter() throws IOException {
        return new PrintWriter(caw);
    }

    @Override
    public String toString() {
        return caw.toString();
    }
}
