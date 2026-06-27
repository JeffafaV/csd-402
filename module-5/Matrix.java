// Jeff Victorino
// 06/28/2026
// Module 5.2 Assignment

import java.util.Arrays;
public class Matrix {
    // get location of largest item in double matrix
    public static int [] locateLargest (double [][] arrayParam) {
        int[] location = {-1, -1};
        double largestNum = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestNum) {
                location[0] = i;
                location[1] = j;
                largestNum = arrayParam[i][j];
            }
        }
    }

        return location;
    }

    // get location of largest item in int matrix
    public static int [] locateLargest (int [][] arrayParam) {
        int[] location = {-1, -1};
        int largestNum = Integer.MIN_VALUE;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largestNum) {
                    location[0] = i;
                    location[1] = j;
                    largestNum = arrayParam[i][j];
                }
            }
        }

        return location;
    }

    // get location of smallest item in double matrix
    public static int [] locateSmallest (double [][] arrayParam) {
        int[] location = {-1, -1};
        double smallestNum = Double.POSITIVE_INFINITY;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallestNum) {
                    location[0] = i;
                    location[1] = j;
                    smallestNum = arrayParam[i][j];
                }
            }
        }

        return location;
    }

    // get location of smallest item in int matrix
    public static int [] locateSmallest (int [][] arrayParam) {
        int[] location = {-1, -1};
        int smallestNum = Integer.MAX_VALUE;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallestNum) {
                    location[0] = i;
                    location[1] = j;
                    smallestNum = arrayParam[i][j];
                }
            }
        }

        return location;
    }
    public static void main(String[] args) {
        // int matrix
        int[][] intMatrix = {
            {12, 45, 7},
            {89, 23, 56},
            {34, 91, 18}
        };

        // double matrix
        double[][] doubleMatrix = {
            {12.5, 45.8, 34.9},
            {89.1, 23.4, 91.3},
            {7.2, 56.7, 18.6}
        };

        // print int matrix
        System.out.println("Int Matrix:");
        System.out.println(Arrays.deepToString(intMatrix));
        System.out.println("The largest value is 91 at location" + Arrays.toString(locateLargest(intMatrix)));
        System.out.println("The smallest value is 7 at location" + Arrays.toString(locateSmallest(intMatrix)));

        // print double matrix
        System.out.println("Double Matrix:");
        System.out.println(Arrays.deepToString(doubleMatrix));
        System.out.println("The largest value is 91.3 at location" + Arrays.toString(locateLargest(doubleMatrix)));
        System.out.println("The smallest value is 7.2 at location" + Arrays.toString(locateSmallest(doubleMatrix)));
    }
}