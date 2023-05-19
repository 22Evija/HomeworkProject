package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class DigitCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        System.out.println("The sum is" + sum);
    }
}
