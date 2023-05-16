package io.codelex.arithmetic.practice;
import java.util.Random;
import java.util.Scanner;
public class PickNumber {

    public static void main(String[] arguments) {
        Random randomGenerator = new Random();
        int numberPick = randomGenerator.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");


        int userPick = input.nextInt();
        if (userPick == numberPick) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (userPick > numberPick) {
            System.out.println("Sorry, you are too high.  I was thinking of 51.");
        } else {
            System.out.println("Sorry, you are too low.  I was thinking of 34.");
        }

    }
}
