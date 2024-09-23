package ccc.CalorieCounter;
import java.util.Scanner;

/**
 * author: Tarkan Zarrouk
 * date: 09/19/2024
 * Calorie counter thingie
 */
public class CalorieCountingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int order1 = input.nextInt();
        int order2 = input.nextInt();
        int order3 = input.nextInt();
        int order4 = input.nextInt();
        
        int calorieCounter = 0;
        switch(order1) {
            case 1:
                calorieCounter = calorieCounter + 461;
            break;
            case 2:
                calorieCounter = calorieCounter + 431;
            break;
            case 3:
                calorieCounter = calorieCounter + 420;
            break;
            case 4:
            break;
        }

        switch(order2) {
            case 1:
                calorieCounter = calorieCounter + 100;
            break;
            case 2:
                calorieCounter = calorieCounter + 57;
            break;
            case 3:
                calorieCounter = calorieCounter + 70;
            break;
            case 4:
            break;
        }
        switch(order3) {
            case 1:
                calorieCounter = calorieCounter + 130;
            break;
            case 2:
                calorieCounter = calorieCounter + 160;
            break;
            case 3:
                calorieCounter = calorieCounter + 118;
            break;
            case 4:
            break;
        }
        switch(order4) {
            case 1:
                calorieCounter = calorieCounter + 167;
            break;
            case 2:
                calorieCounter = calorieCounter + 266;
            break;
            case 3:
                calorieCounter = calorieCounter + 75;
            break;
            case 4:
            break;
        }

        System.out.printf("Your total Calorie count is %d.\n", calorieCounter);
        input.close();
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
