package io.codelex.typesandvariables.practice;


import java.util.Scanner;
public class UppercaseFirstLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int uppercaseLetters = 0;
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (Character.isUpperCase(character)) {
                uppercaseLetters++;

            }

        }

        System.out.println("The number of uppercase is" + uppercaseLetters);

    }
}


