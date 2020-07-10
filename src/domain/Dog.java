package com.nero.java.jsp.domain;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * @created nero
 * @date 2018/9/5 11:33
 */
public class Dog implements HttpSessionBindingListener {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        HttpSession session = httpSessionBindingEvent.getSession();
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}
