package com.amibotnaidra.code;

public class MathGameView {
    private final MathGameService mathGameService;

    public MathGameView(MathGameService mathGameService) {
        this.mathGameService = mathGameService;
    }

    void home() {

        ViewLoop:
        while (true) {
            System.out.println("=== Welcome to Math Game ===");
            System.out.println("\nLevel Options Menu:");
            System.out.println("1. Level 1 (Addition)");
            System.out.println("2. Level 2 (Subtraction)");
            System.out.println("3. Level 3 (Multiplication)");
            System.out.println("4. Exit");

            var input = InputUtil.input("Select the options menu");
            switch (input) {
                case "1" -> addition();
                case "2" -> subtraction();
                case "3" -> multiplication();
                case "4" -> {
                    System.out.println("Thank you for playing!");
                    break ViewLoop;
                }
                default -> System.out.println("Invalid option!");
            }
        }

    }

    void addition() {
        System.out.println("\n=== Addition Level ===");
        mathGameService.addition();
    }

    void subtraction() {
        System.out.println("\n=== Subtraction Level ===");
        mathGameService.subtraction();
    }

    void multiplication() {
        System.out.println("\n=== Multiplication Level ===");
        mathGameService.multiplication();
    }
}
