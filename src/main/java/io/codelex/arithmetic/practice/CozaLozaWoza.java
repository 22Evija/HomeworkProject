package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
for (int i = 1; i <= 110; i++) {
    //boolean  = false;
    if (i % 3 == 0) {
        System.out.println("Coza");
    }
    if (i % 5 == 0) {
        System.out.println("Loza");
    }
    if (i % 7 == 0) {
        System.out.println("Woza");
    }
    if (i % 9 == 0) {
        System.out.println();
    }
}


    }
}