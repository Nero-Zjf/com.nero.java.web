package com.nero.java.jsp.gzipFilter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

/**
 * @created nero
 * @date 2018/9/19 9:51
 */
public class ResponseWraper extends HttpServletResponseWrapper {

    private GZIPServletOutputStream servletGzipOS = null;
    private PrintWriter pw = null;

    /**
     * Constructs a response adaptor wrapping the given response.
     *
     * @param response The response to be wrapped
     * @throws IllegalArgumentException if the response is null
     */
    public ResponseWraper(HttpServletResponse response) {
        super(response);
    }

    public GZIPOutputStream getGZIPOutputStream(){
        return this.servletGzipOS.internalGzipOS;
    }

    private Object streamUsed = null;


    @Override
    public ServletOutputStream getOutputStream() throws IOException {
        if ((streamUsed != null) && (streamUsed != pw)) {
            throw new IllegalStateException();
        }

        if (servletGzipOS == null) {
            servletGzipOS = new GZIPServletOutputStream(getResponse().getOutputStream());
            streamUsed = servletGzipOS;
        }

        return servletGzipOS;
    }

    @Override
    public PrintWriter getWriter() throws IOException {
        if ((streamUsed != null) && (streamUsed != pw)) {
            throw new IllegalStateException();
        }

        if (pw == null) {
            servletGzipOS = new GZIPServletOutputStream(getResponse().getOutputStream());
            OutputStreamWriter osw = new OutputStreamWriter(servletGzipOS,
                    getResponse().getCharacterEncoding());
            pw = new PrintWriter(osw);
            streamUsed = pw;
        }
        return pw;
    }
}
