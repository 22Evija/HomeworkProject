package io.codelex.loops.practice;
import java.util.Scanner;
public class WordsPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = scanner.next();

        System.out.println("Enter second word:");
        String secondWord = scanner.next();

        int dotsNumber = 30 - firstWord.length() - secondWord.length();

        String dots = ".".repeat(dotsNumber);
        System.out.println(firstWord + dots + secondWord);

        }
    }


