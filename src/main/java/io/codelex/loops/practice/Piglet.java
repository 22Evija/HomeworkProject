package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Piglet!");

        int totalScore = 0;

        while (true) {
            int roll = random.nextInt(6) + 1;
            System.out.println("You rolled a " + roll + "!");

            if (roll == 1) {
                totalScore = 0;
                break;
            } else {
                totalScore += roll;
            }
            System.out.print("Roll again? (yes/no)");
            String response = in.nextLine().trim().toLowerCase();

            if (!response.equals("yes")) {
                break;
            }
        }

        System.out.println("You got " + totalScore + " points.");
    }
}






