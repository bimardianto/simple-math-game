package com.amibotnaidra.code;

import java.util.Scanner;

public class MathGameUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String input(String info) {
        System.out.print(info + ": ");
        return scanner.nextLine();
    }

    public static Integer inputNumber() {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number!");
                System.out.print("Repeat the input: ");
            }
        }
        return number;
    }

    public static boolean checkAnswer(String answer, String correctAnswer, int question, int score, int lives, final int MAX_QUESTION) {
        if (answer.equals(correctAnswer)) {
            score += 2;
            System.out.println("Hooray... correct! your score is " + score + " (lives " + lives + ")");
        } else {
            score -= 2;
            lives--;
            System.out.println("Sorry, wrong answer. Your score is " + score + " (lives: " + lives + ")");
            if (lives == 0) {
                System.out.println("GAME OVER");
                System.out.println("Score: " + score);
                return false;
            }
        }
        if (question == (MAX_QUESTION - 1)) {
            System.out.println("Thank you for playing! Your score is " + score);
            return false;
        }
        return true;
    }

}
