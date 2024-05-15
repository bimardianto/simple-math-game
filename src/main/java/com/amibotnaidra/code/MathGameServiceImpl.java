package com.amibotnaidra.code;

import java.util.Random;

public class MathGameServiceImpl implements MathGameService{
    private final int MAX_LIVES = 3;
    private final int MAX_QUESTION = 5;

    @Override
    public void addition() {
        System.out.println("Lives: " + MAX_LIVES + " | Score: 0");
        Random random = new Random();

        for (int lives = MAX_LIVES, score = 0, question = 0; question < MAX_QUESTION; question++) {
            var num1 = random.nextInt(201) - 100;
            var num2 = random.nextInt(201) - 100;
            System.out.print("Question " + (question + 1) + " : " + num1 + " + " + num2 + " = ");
            var answer = MathGameUtil.inputNumber();
            int correctAnswer = num1 + num2;
            if (answer == correctAnswer) {
                score += 2;
                System.out.println("Hooray... correct! your score is " + score + " (lives " + lives +")");
            } else {
                score -= 2;
                lives--;
                System.out.println("Sorry, wrong answer. Your score is " + score + " (lives: " + lives + ")");
                if (lives == 0) {
                    System.out.println("GAME OVER");
                    System.out.println("Score: " + score);
                    break;
                }
            }
            if (question == (MAX_QUESTION - 1)) {
                System.out.println("Thank you for playing! Your score is " + score);
                break;
            }
        }
    }



    @Override
    public void subtraction() {
        System.out.println("Lives: " + MAX_LIVES + " | Score: 0");
        Random random = new Random();

        for (int lives = MAX_LIVES, score = 0, question = 0; question < MAX_QUESTION; question++) {
            var num1 = random.nextInt(201) - 100;
            var num2 = random.nextInt(201) - 100;
            System.out.print("Question " + (question + 1) + " : " + num1 + " - " + num2 + " = ");
            var answer = MathGameUtil.inputNumber();
            int correctAnswer = num1 - num2;
            if (answer == correctAnswer) {
                score += 2;
                System.out.println("Hooray... correct! your score is " + score + " (lives " + lives +")");
            } else {
                score -= 2;
                lives--;
                System.out.println("Sorry, wrong answer. Your score is " + score + " (lives: " + lives + ")");
                if (lives == 0) {
                    System.out.println("GAME OVER");
                    System.out.println("Score: " + score);
                    break;
                }
            }
            if (question == (MAX_QUESTION - 1)) {
                System.out.println("Thank you for playing! Your score is " + score);
                break;
            }
        }
    }

    @Override
    public void multiplication() {
        System.out.println("Lives: " + MAX_LIVES + " | Score: 0");
        Random random = new Random();

        for (int lives = MAX_LIVES, score = 0, question = 0; question < MAX_QUESTION; question++) {
            var num1 = random.nextInt(201) - 100;
            var num2 = random.nextInt(201) - 100;
            System.out.print("Question " + (question + 1) + " : " + num1 + " x " + num2 + " = ");
            var answer = MathGameUtil.inputNumber();
            int correctAnswer = num1 * num2;
            if (answer == correctAnswer) {
                score += 2;
                System.out.println("Hooray... correct! your score is " + score + " (lives " + lives +")");
            } else {
                score -= 2;
                lives--;
                System.out.println("Sorry, wrong answer. Your score is " + score + " (lives: " + lives + ")");
                if (lives == 0) {
                    System.out.println("GAME OVER");
                    System.out.println("Score: " + score);
                    break;
                }
            }
            if (question == (MAX_QUESTION - 1)) {
                System.out.println("Thank you for playing! Your score is " + score);
                break;
            }
        }
    }

    
}
