package arrays;


import java.util.Scanner;

/**
 * author: Tarkan Zarrouk
 * date: 09/26/2024
 * Work stuff cuzzo
 */

 //comments
 //comments
 //comments
 //comments
 //comments
 //comments
 //comments
 //comments
 //comments
 //comments
 //comments

/*******************************************
 * PLEASE READ THE INSTRUCTIONS
 * 
 * There are three activity methods below each with its own task. Only work
 * within those methods and DO NOT modify anything outside of their code block;
 * 
 * The activities are meant to provide you with the opportunity to practice your
 * coding skills.
 */

public class Arrays1D {
    // instance variables that will be use in activity code.
    static int[] practiceArrayInt = new int[5];
    static String[] practiceArrayString = { "This", "sentence", "has", "five", "words." };

    public static void main(String[] args) {

        // filling the array of size 5 with random integers
        for (int i = 0; i < practiceArrayInt.length; i++) {
            practiceArrayInt[i] = (int) (Math.random() * 10 + 1);
        }

        System.out.println("-----------------Display Example------------------------");
        displayExample();

        System.out.println();
        System.out.println("------------------Activity One--------------------------");
        activityOne();

        System.out.println();
        System.out.println("------------------Activity Two--------------------------");
        activityTwo();

        System.out.println();
        System.out.println("------------------Activity Three------------------------");
        activityThree();

    }

    /**************************************************
     * The displayExample() method demonstrates how to create, set and display
     * arrays.
     *************************************************/

    public static void displayExample() {

        // declare an integer array with 5 elements
        int[] array = new int[5];

        // declare and initialize an integer array with 5 elements
        int[] array2 = { 11, 22, 33, 44, 55 };

        // iterate though an array using a for loop to set and display values.
        for (int i = 0; i < array.length; i++) {

            // set array at index i to a random number between 1 and 10
            array[i] = (int) (Math.random() * 10 + 1);

            // display the value inside an array. You treat an array
            // element just the same as a normal array.
            System.out.println(array2[i]);
        }
    }// end displayExample()

    /**************************************************
     * Activity 1
     * 
     * In the following method iterate through the provided array displaying all
     * their values.
     *
     * Provide arrays:
     *
     * practiceArrayInt practiceArrayString
     *
     *************************************************/

     public static void activityOne() {
        for (int i = 0; i < practiceArrayInt.length; i++) {
            System.out.println(practiceArrayInt[i]);
        }
        for (int index = 0; index < practiceArrayString.length; index++) {
            System.out.println(practiceArrayString[index]);
        }
    }

    /**************************************************
     * Activity 2
     * 
     * In the following method ask the user to select a number between 1 and 10.
     * Then search through the provided array to see if that number appears. If the
     * number is found, display their index locations. If the number is not found
     * display a -1.
     *
     * Provided Array:
     * 
     * practiceArrayInt
     * 
     *************************************************/

     public static void activityTwo() {
        Scanner input = new Scanner(System.in);
        // Store the next integer value from user
        int chosenNumber = input.nextInt();
        // loop over practiceArrayInt to perform checks on whether chosenNumber exists within array
        for(int i=0;i<practiceArrayInt.length;i++) {
            // System.out.println(practiceArrayInt[i]);
            // if chosenNumber exists within array, print out the current index position
            if(chosenNumber == practiceArrayInt[i]) {
                System.out.println(i);
            // else, print out -1.
            } else {
                System.out.println(-1);
            }
        }

        input.close();
    }// end activityTwo()

    /**************************************************
     * Activity 3
     * 
     * In the following method block write a program that iterates through the
     * provided array and assigns its element's values to another array in reverse
     * order. Name the array reverseArray.
     * 
     * Using the provided string array, output the word contained in each element in
     * reverse order using the charAt() method.
     * 
     * Example: String[] array = { "Hey", "dude" } On each line: yeH edud
     *
     * Provided Array:
     *
     * practiceArrayInt
     * practiceArrayString
     * 
     *************************************************/

    public static void activityThree() {

        int[] practiceArrayInt = { 11, 22, 33, 44, 55 };
        int[] reverseArray = new int[practiceArrayInt.length];
        // loop over practiceArrayInt, going from right to left, not left to right
        for(int i=0;i<practiceArrayInt.length;i++) {
            reverseArray[i] = practiceArrayInt[practiceArrayInt.length - 1 - i];
        }
        for(int num: reverseArray) {
            System.out.println(num);
        }
        // for(int i=practiceArrayString.length - 1; i<=practiceArrayString.length;i--) {
        //     System.out.println(practiceArrayString.length);
        // }
        for(int i = 0; i < practiceArrayString.length; i++) {
            String word = practiceArrayString[i];
            String reversedWord = "";
            for(int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            System.out.println(reversedWord);
        }

    }// end activityThree()
}// end Arrays1D
