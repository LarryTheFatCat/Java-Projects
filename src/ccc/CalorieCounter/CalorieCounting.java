package ccc.CalorieCounter;

import java.util.Scanner;

/**
 * author: Tarkan Zarrouk
 * date: 09/19/2024
 * Calorie counter thingie
 */

public class CalorieCounting {
    public static void main(String[] args) {
        int calorieCounter = 0;
        Scanner input = new Scanner(System.in);
        int burgerChoice = input.nextInt();
        boolean testingTrue = false;
        if(burgerChoice > 0)  testingTrue = true;

        int sideChoice = input.nextInt();
        boolean sideTrue = false; // default value
        if(sideChoice > 0) sideTrue = true;

    
        int drinkChoice = input.nextInt();
        boolean drinkSelect = false;
        if(drinkChoice > 0) drinkSelect = true; 

        int dessertChoice = input.nextInt();
        boolean dessertSelect = false;
        if(dessertChoice > 0) dessertSelect = true;

        input.close();
        if(testingTrue) {
            if(burgerChoice == 1) {
                calorieCounter = calorieCounter + 461;
            } else if(burgerChoice == 2) {
                calorieCounter = calorieCounter + 431;
            } else if(burgerChoice == 3) {
                calorieCounter = calorieCounter + 420;
            } else if(burgerChoice == 4) {
                calorieCounter = calorieCounter + 0;
            }
        } else {
            return;
        }
        if(sideTrue) {
            if(sideChoice == 1) {
                calorieCounter = calorieCounter + 100;
            } else if(sideChoice == 2) {
                calorieCounter = calorieCounter + 57;
            } else if(sideChoice == 3) {
                calorieCounter = calorieCounter + 70;
            } else if(sideChoice == 4) {
                calorieCounter = calorieCounter + 0;
            }
        }
        if(drinkSelect) {
            if(drinkChoice == 1) {
                calorieCounter = calorieCounter + 130;
            } else if(drinkChoice == 2) {
                calorieCounter = calorieCounter + 160;
            } else if(drinkChoice == 3) {
                calorieCounter = calorieCounter + 118;
            } else if(drinkChoice == 4) {
                calorieCounter = calorieCounter + 0;
            }
        }
        if(dessertSelect) {
            if(dessertChoice == 1) {
                calorieCounter = calorieCounter + 167;
            } else if(dessertChoice == 2) {
                calorieCounter = calorieCounter + 266;
            } else if(dessertChoice == 3) {
                calorieCounter = calorieCounter + 75;
            } else if(calorieCounter == 4) {
                calorieCounter = calorieCounter + 0;
            }
        }
        System.out.printf("Your total Calorie count is %d.\n", calorieCounter);    
    }
}


// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments
// comments