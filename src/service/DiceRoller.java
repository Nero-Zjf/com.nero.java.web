package com.nero.java.jsp.service;

import java.util.Random;

/**
 * @created nero
 * @date 2018/9/6 14:53
 */
public class DiceRoller {
    public static int rollDice() {
        return (int) ((Math.random() * 6) + 1);
    }
}
