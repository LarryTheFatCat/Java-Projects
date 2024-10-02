package maths;

/**
 * A program that attempts to disprove Goldbach's Conjecture
 * @author Tarkan Zarrouk
 * @version 1.1 10/02/2024
 * Goldbach's conjecture program
 */

import java.util.Scanner;

public class Goldbach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value = getNumber(input);
        while (value != 0) {
            value = getNumber(input);
            testGoldbach(value);
            getPrimeAfter(value);
        }
    }

    /**
     * Prompt a user for a non-negative even integer other than 2.
     * 
     * If necessary, prompt user repeatedly until a valid value is given.
     * 
     * @param input Injected Scanner class
     * @return either 0 or an even number > 2
     */
    public static int getNumber(Scanner input) {
        System.out.print("Enter an even non-negative integer other then 2: ");
        int nonNegEvenNum = input.nextInt();
        return nonNegEvenNum;
    }

    /**
     * Test Goldbach's Conjecture for a given integer and print
     * an appropriate message based on the results of the test
     * 
     * @param n an integer assumed to be even and > 2
     */
    public static void testGoldbach(int n) {
        if (n <= 2 || n % 2 != 0) {
            System.out.println("Input must be an even integer greater than 2.");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                return;
            }
        }
        System.out.println("No prime pair found for " + n);
    }

    /**
     * Determine whether or not a number is prime
     * 
     * @param n The number in question
     * @return true if n is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
       for(int i=2;i<=n/2;i++){
           if(n % i == 0)
               return  false;
       }
       return true;
    }

    /**
     * Find the next prime number after n.
     * 
     * @param n an integer assumed to be a prime number
     * @return the next prime number after n
     */
    public static int getPrimeAfter(int n) {
        if(n == 2) return 3;
        int nextPrimeNumber = n;
        do {
            nextPrimeNumber += 2;
        } while(isPrime(nextPrimeNumber) == false);
        return nextPrimeNumber;
    }

}