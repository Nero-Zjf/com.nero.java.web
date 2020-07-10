package com.nero.java.jsp.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @created nero
 * @date 2018/9/13 11:45
 */
public class SimpleTagDemo extends SimpleTagSupport implements DynamicAttributes {
    private String title;
    private Map<String, String> attributeMap = new HashMap<>();

    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print("<h1");
        for (String key : attributeMap.keySet()) {
            getJspContext().getOut().print(" " + key + "=\"" + attributeMap.get(key) + "\"");
        }
        getJspContext().getOut().print(" >title is " + title + "</h1><br>");
        getJspBody().invoke(null);
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public void setDynamicAttribute(String uri, String localName, Object value) throws JspException {
        this.attributeMap.put(localName, value.toString());
    }
}
