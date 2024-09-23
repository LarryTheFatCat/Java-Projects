package ccc.FizzBuzz;

import java.util.Scanner;

/**
 * author: Tarkan Zarrouk
 * date: 09/23/2024
 * FizzBuzz thingie
 */

public class FizzBuzz {
    public static void main(String[] args) {
        // init scanner input
        Scanner input = new Scanner(System.in);
        // take in the next integer input by user
        int fizzNum = input.nextInt();
        // call fizzbuzz function to check
        fizzBuzz(fizzNum);

        input.close();
    }
    
    /**
     * fizzBuzz
     * @param n
     * @return if n is a fizz buzz
     */
    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}