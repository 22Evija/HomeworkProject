package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String myName, myEyes, myTeeth, myHair;
        int myAge;
        double myHeight, myWeight;

        String name = "Zed A. Shaw";
        int age = 35;
        double height = 74 * 2.54;  // inches
        double weight = 180 * 0.453592; // lbs
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " inches tall.");
        System.out.println("He's " + weight + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}