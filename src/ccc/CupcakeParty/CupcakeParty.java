package ccc.CupcakeParty;

import java.util.Scanner;

public class CupcakeParty {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 28;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter regular cupcake numbers: ");
        int reg = input.nextInt();
        System.out.print("Enter the number of small cupcakes: ");
        int sml = input.nextInt();

        int cupcakeCalc = (reg * 8) + (sml * 3);
        int finalCupcakeCalc = cupcakeCalc - NUM_STUDENTS;
        System.out.println(finalCupcakeCalc);
        input.close();
    }
}
