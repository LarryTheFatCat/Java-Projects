package primitives;

/**
 * author: Tarkan Zarrouk
 * date: 12/09/2024
 * temperature converter
 */

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user with "Enter the temp: "  
        System.out.print("Enter the temp: ");
        // Initialize a double variable called `temp` to the next double entered.
        double temp = input.nextDouble();

        // Prompt the user with "Enter the temperature unit (c or f): "
        System.out.print("Enter the temperature unit (c or f): ");

        // Initialize a char variable called `unit` with `input.next(".").charAt(0)`
        char unit = input.next(".").charAt(0);

        // Declare a new variable called `convertedTemp`
        double convertedTemp;

        // if the unit == 'c', then assign `convertedTemp` to the formula to convert celcius to fahrenheit
        // else if the unit == 'f', then assign `convertedTemp` to the formula to convert fahrenheit to celcius
        // else, print "Invalid unit. Not converting the temp." then assign `convertedTemp` to `temp`        
        if (unit == 'c') {
            convertedTemp = (temp * 9/5) + 32;
        } else if (unit == 'f') {
            convertedTemp = (temp - 32) * 5/9;
        } else {
            System.out.println("Invalid unit. Not converting the temp.");
            convertedTemp = temp;
        }
    
        // Print, using printf "Your converted temp is %.2f\n" and pass in `convertedTemp`
        System.out.printf("Your converted temp is %.2f\n", convertedTemp);

        input.close();
    }
}