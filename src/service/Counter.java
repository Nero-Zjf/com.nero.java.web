package com.nero.java.jsp.service;

/**
 * @created nero
 * @date 2018/9/5 14:04
 */
public class Counter {
    private static int count;
    public static synchronized int getCount(){
        count++;
        return count;
    }
}
