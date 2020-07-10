package com.nero.java.jsp.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @created nero
 * @date 2018/9/5 10:24
 */
public class ServletListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        boolean isNew = httpSessionEvent.getSession().isNew();
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {

    }
}
