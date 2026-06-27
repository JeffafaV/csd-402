// Jeff Victorino
// 06/21/2026
// Module 4.2 Assignment

import java.util.Arrays;

public class MethodOverload {
    // average function using short data type
    public static short average (short [] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
                total += array[i];
            }

        int avg = total / array.length;

        return (short)avg;
    }

    // average function using int data type
    public static int average (int [] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        int avg = total / array.length;

        return avg;
    }

    // average function using long data type
    public static long average (long [] array) {
        long total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }

        long avg = total / array.length;

        return avg;
    }

    // average function using double data type
    public static double average (double [] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
        total += array[i];
        }

        double avg = total / array.length;

        return avg;
    }
    
	public static void main(String[] args) {
        // arrays using different data types
        short[] shortArr = {1, 2};
        int[] intArr = {1, 2, 3};
        long[] longArr = {1, 2, 3, 4};
        double[] doubleArr = {1.1, 2.2, 3.3, 4.4, 5.5};

        // calculating averages using the different overloaded functions
        System.out.println("Short Array: " + Arrays.toString(shortArr));
        System.out.println("Average = " + average(shortArr));
        System.out.println();

        System.out.println("Int Array: " + Arrays.toString(intArr));
        System.out.println("Average = " + average(intArr));
        System.out.println();

        System.out.println("Long Array: " + Arrays.toString(longArr));
        System.out.println("Average = " + average(longArr));
        System.out.println();

        System.out.println("Double Array: " + Arrays.toString(doubleArr));
        System.out.println("Average = " + average(doubleArr));
        System.out.println();
    }
}