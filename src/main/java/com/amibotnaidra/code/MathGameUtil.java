package com.amibotnaidra.code;

import java.util.Scanner;

public class InputUtil {
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

}
