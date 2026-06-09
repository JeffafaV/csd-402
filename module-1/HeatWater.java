// Jeff Victorino
// 06/07/2026
// Module 1.3 Assignment

import java.util.Scanner;

// heat water class
public class HeatWater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // user input for weight of water
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        // user input for initial temp of water
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();

        // user input for final temp of water
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();

        // calculate energy needed
        double q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // display result
        System.out.printf("The energy needed is %.2f joules.%n", q);

        input.close();
    }
}