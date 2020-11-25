package com.company;

public class Main {

    private static boolean cool = false;
    private static final boolean notCool = false;

    public static void main(String[] args) {
//	    int result = calculateScore(2);
//	    if (result > 100) {
//	        cool = true;
//        }
//
//        System.out.println(tellMeTheScore(result));
//
//	    SpeedConverter converter = new SpeedConverter();
//
//	    converter.printConversion(10.25);
        int newScore = calculateScore("Jason", 500);
        System.out.println("New score is " + newScore);
        int unamedPlayerScore = calculateScore(200);
        System.out.println("Unamed score is " + unamedPlayerScore);
    }

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
}
