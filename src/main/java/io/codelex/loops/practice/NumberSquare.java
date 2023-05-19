package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Max? ");
        int max = scanner.nextInt();

        System.out.print("Min? ");
        int min = scanner.nextInt();

        for (int i = min; i <= max - min; i++) {
            for (int j = 0; j <= max - min; j++) {
                int number = (i + j);
                if (number > max) {
                    number = number - max + min - 1;
                }
                System.out.print(number);
            }
            System.out.println();
        }
    }

}
