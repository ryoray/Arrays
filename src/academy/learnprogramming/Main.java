package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanNumber = new Scanner(System.in);

    public static void main(String[] args) {

        // First way to create an array

        int[] myFirstIntArray;                  // array declaration in two rows
        myFirstIntArray = new int[10];

        myFirstIntArray[0] = 28;                // the index for array in java is always started from 0
        myFirstIntArray[9] = 30;                // if we want to have 10 slots of array data, then the index is from 0 to 9
//        System.out.println(myFirstIntArray[0]);
//        System.out.println(myFirstIntArray[9]);

        // Second way to create array

        double[] myFirstDoubleArray = new double [5];       // array declaration in single row

        myFirstDoubleArray[0] = 1.0;
        myFirstDoubleArray[1] = 2.0;
        myFirstDoubleArray[2] = 3.0;
        myFirstDoubleArray[4] = 5.0;
//        System.out.println(myFirstDoubleArray[4]);
//        System.out.println(myFirstDoubleArray[0]);

        // Third way to create array

        String[] myFirstStringArray = {"First", "Second", "Third", "Fourth"};   // array declaration and input the data right away

//        System.out.println(myFirstStringArray[0]);
//        System.out.println(myFirstStringArray[3]);

        int[] months = new int[10];
        for (int i=0; i<months.length; i++) {
            months[i] = (i+1)*10;
        }

//        for (int i=0; i<months.length; i++) {
//            System.out.println("Array element [" + i + "] is holding a value of " + months[i]);
//        }

//        printArray(months);

        int[] myIntegers = getIntegers(5);
        double sum = 0;
        for (int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
            sum += myIntegers[i];
        }
        System.out.println("Average of " + myIntegers.length + " numbers above is " + ((double) sum / (double) myIntegers.length));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer number.\r" );
        int[] values = new int[number];

        for (int i=0; i<values.length; i++) {
            values[i] = scanNumber.nextInt();
        }
        return values;
    }

//    public static void printArray(int[] array) {
//        for (int i=0; i<array.length; i++) {
//            System.out.println("Array element [" + i + "] is holding a value of " + array[i]);
//        }
//    }
}
