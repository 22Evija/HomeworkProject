package io.codelex.arithmetic.practice;

public class CheckOddEven {

    public static void main(String[] arguments) {

        int number = Integer.parseInt(arguments[0]);

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("bye!");
    }
}

