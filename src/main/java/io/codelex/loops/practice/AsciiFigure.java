package io.codelex.loops.practice;

public class AsciiFigure {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        for (int line = 1; line <= SIZE; line++) {

            for (int i = 0; i <= (SIZE - line) * 4; i++) {
                System.out.print("/");
            }
            // print the asterisks
            for (int i = 0; i < (line - 1) * 8; i++) {
                System.out.print("*");
            }

            for (int i = 0; i <= (SIZE - line) * 4; i++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}







