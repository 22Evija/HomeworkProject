package io.codelex.arithmetic.practice;

public class NumberCheck {
    public static void main(String[] arguments) {
        System.out.println(checkNumbers(10, 15));
        System.out.println(checkNumbers(6, 10));
        System.out.println(checkNumbers(15, 4));
        System.out.println(checkNumbers(25, 16));
        System.out.println(checkNumbers(5, 15));
    }

    public static boolean checkNumbers(int number1, int number2) {
        return number1 == 15 || number2 == 15 || number1 + number2 == 15 || Math.abs(number1 - number2) == 15;

    }
}
