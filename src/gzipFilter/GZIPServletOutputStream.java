package com.nero.java.jsp.gzipFilter;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class GZIPServletOutputStream extends ServletOutputStream {

    GZIPOutputStream internalGzipOS;

    public GZIPServletOutputStream(ServletOutputStream sos) throws IOException {
        this.internalGzipOS = new GZIPOutputStream(sos);
    }

    @Override
    public void write(int b) throws IOException {
        internalGzipOS.write(b);
    }

    @Override
    public boolean isReady() {
        return false;
    }

    @Override
    public void setWriteListener(WriteListener listener) {

    }
}
