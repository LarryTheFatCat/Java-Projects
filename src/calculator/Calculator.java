package calculator;

import java.util.Scanner;

/**
 * author: Tarkan Zarrouk
 * date: 12/09/2024
 * temperature converter
 */

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my calculator app.");

        // Prompt the user to input a number: "num1> "
        System.out.print("num1>: ");

        // use input.nextDouble()
        double numOne = input.nextDouble();

        System.out.print("op> ");
        char op = input.next(".").charAt(0);

        System.out.print("num2> ");
        double numTwo = input.nextDouble();

        double ans = 0;

        if(op == '/') {
            ans = numOne / numTwo;
        } else if(op == '-') {
            ans = numOne - numTwo;
        } else if(op == '*') {
            ans = numOne * numTwo;
        } else if(op == '+') {
            ans = numOne + numTwo; 
        } else {
            System.out.println("Invalid operation");
            ans = numOne;
        }
        System.out.printf("%.2f %c %.2f = %.2f", numOne, op, numTwo, ans);
        input.close();

        // Prompt the user to input a character (+, - , *, /): "op>"
        // use input.next(".").charAt(0)
        // Prompt the user to input a number: "num2> "
        // use input.nextDouble()

        // Create a double called ans and set it eqaul to 0.
        // Perform the appropriate calculation using ifs.
        // If the operator is invalid, print "Invalid operation" and set the ans = a;

        // print (using printf)"%.2f %c %.2f = %.2f", a, s, b, ans
    }
}
