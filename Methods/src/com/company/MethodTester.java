package com.company;

import java.util.Scanner;

public class MethodTester {
    private static boolean cool = false;
    private static final boolean notCool = false;

    public static int calculateScore(Integer input) {
        return input * 100;
    }

    public static String tellMeTheScore(Integer input) {
        return (input + " and " + cool + " and not cool " + notCool);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unamed player scored " + score + " points");
        return score * 1000;
    }

    public static void readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        int age = 2020 - scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + ". Your age is " + age);
        scanner.close();
    }
}
