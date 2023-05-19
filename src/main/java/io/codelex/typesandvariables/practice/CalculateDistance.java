package io.codelex.typesandvariables.practice;


import java.util.Scanner;

public class CalculateDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input distance in meters:");
        double distance = scanner.nextDouble();

        System.out.println("Input hour:");
        double hours = scanner.nextDouble();

        System.out.println("Input minutes:");
        double minutes = scanner.nextDouble();

        System.out.println("Input seconds:");
        double seconds = scanner.nextDouble();

        double timeInSeconds = (hours * 3600) + (minutes * 60) + seconds;
        double timeInHours = timeInSeconds / 3600;

        double metersInSecond = distance / timeInSeconds;
        double kmInHour = (distance / 1000) / timeInHours;
        double milesInHour = (distance / 1609) / timeInHours;

        System.out.printf("Your speed in meters/second is", metersInSecond);
        System.out.printf("Your speed in km/h is", kmInHour);
        System.out.printf("Your speed in miles/h is", milesInHour);
    }

}

