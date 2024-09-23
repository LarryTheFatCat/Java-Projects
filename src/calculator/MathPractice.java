package calculator;

/**
 * author: Tarkan Zarrouk
 * date: 09/17/2024
 * Math excericses with Java!
 */

public class MathPractice {
    public static void main(String[] args) {
        // Call, and print, the values of the below functions to test.
        // Your main method is not being tested in this assignment
        System.out.println(f3(1, 1, -2));
    }

    // I'm giving this to you so you can see how things work with functions
    public static int sum(int a, int b){
        return a + b;
    }

    /**
     * Compute: f1(x) = 5x + 3
     * 
     * Example:
     * <pre>
     * <code>
     * int ans = f1(3);
     * System.out.println(ans);  //18
     * </code>
     * </pre>
     * @param x
     * @return The computed value
     */
    public static int f1(int x) {
        return 5 * x + 3;
    }

   /**
     *                      _________ 
     * Compute: f2(a, b) = √π|a²+b²|
     * 
     * Example:
     * <pre>
     * <code>
     * int ans = f2(3, 4);
     * System.out.println(ans);  //8.86226925452758
     * </code>
     * </pre>
     * @param x
     * @return The computed value
     */
    public static double f2(int a, int b) {
        return Math.sqrt(Math.PI * Math.abs(Math.pow(a, 2) + Math.pow(b, 2)));
    }

    /**
     *                              ______ 
     * Compute: f3(a, b, c) = -b + √b²-4ac
     *                        ---------------
     *                               2a
     * (The quadratic formula, put only the "+" part)
     * Example:
     * <pre>
     * <code>
     * int ans = f3(1, 1, -2);
     * System.out.println(ans);  //-1.5
     * </code>
     * </pre>
     * @param x
     * @return The computed value
     */
    public static double f3(int a, int b, int c) {
        double negativeB = -b;
        double bSquared = Math.pow(b, 2);
        double minusFourAC = 4 * a * c;
        double twoA = 2 * a;
        double sqrtFunc = (negativeB + Math.sqrt(bSquared - minusFourAC)) / twoA;
       return sqrtFunc;
    }    
}