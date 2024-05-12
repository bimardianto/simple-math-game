package com.amibotnaidra.code;

public class MathGame {
    public static void main(String[] args) {
        MathGameService mathGameService = new MathGameServiceImpl();
        MathGameView view = new MathGameView(mathGameService);
        view.home();
    }
}

