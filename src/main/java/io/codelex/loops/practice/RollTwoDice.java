package io.codelex.loops.practice;
import java.util.Random;
import java.util.Scanner;
public class RollTwoDice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Desired sum: ");
        int desiredSum = scanner.nextInt();

        while (true) {
            int roll1 = random.nextInt(6) + 1;
            int roll2 = random.nextInt(6) + 1;
            int sum = roll1 + roll2;

            System.out.println(roll1 + " and " + roll2 + " = " + sum);

            if (sum == desiredSum) {
                break;
            }
        }
    }
}



