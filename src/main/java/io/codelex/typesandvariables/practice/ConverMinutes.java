package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class ConverMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = scanner.nextInt();
        int year = minutes / (60 * 24 * 365);
        int remainMinutes = minutes % (60 * 24 * 365);
        int day = remainMinutes / (60 * 24);
        System.out.println(minutes + "remaining in" + year + "years and days" + day + ".");
    }
}
