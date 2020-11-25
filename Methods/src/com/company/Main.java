package com.company;

public class Main {

    private static boolean cool = false;
    private static final boolean notCool = false;

    public static void main(String[] args) {
	    int result = calculateScore(2);
	    if (result > 100) {
	        cool = true;
        }

        System.out.println(tellMeTheScore(result));
    }

    public static int calculateScore(Integer input) {
        return input * 100;
    }

    public static String tellMeTheScore(Integer input) {
        return (input + " and " + cool + " and not cool " + notCool);
    }
}
