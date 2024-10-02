package ccc.voronoi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * author: Tarkan Zarrouk
 * date: 09/30/2024
 * Voronoi village distance checkers 
 */

public class Voronoi {
    public static void main(String[] args) {
        // N number of villages
        Scanner input = new Scanner(System.in);
        int numberOfVillages = input.nextInt();

        // [0,4,10,15,16]
        int[] villagePositions = new int[numberOfVillages];
        for(int i=0;i<=numberOfVillages - 1;i++) {
            villagePositions[i] = input.nextInt();  
        }

        Arrays.sort(villagePositions);
        
        // Calculate and print midpoints
        double[] villageMidpoints = new double[numberOfVillages - 1];
        for (int i = 0; i < numberOfVillages - 1; i++) {
            villageMidpoints[i] = (villagePositions[i] + villagePositions[i + 1]) / 2.0;
        }
        // leftmost and rightmost are infinite
        // therefore, 0, 16 (using temp array) are infinite
        // else are finite
        // now loop through villageMidpoints taking difference
        // new array for differences in lengths
        double[] villageMidpointsDifference = new double[villageMidpoints.length - 1];
        for (int i = 0; i < villageMidpoints.length - 1; i++) {
            villageMidpointsDifference[i] = villageMidpoints[i + 1] - villageMidpoints[i];
        }
        // sort, again
        Arrays.sort(villageMidpointsDifference);

        // print at index 0 as per lowest size
        System.out.println(villageMidpointsDifference[0]);
        
        input.close();
    }
}
