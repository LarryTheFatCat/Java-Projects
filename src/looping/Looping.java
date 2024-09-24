package looping;

public class Looping {
    public static void main(String[] args) {
        // Again, main method here for your testing purposes
        System.out.println(task4(-12));
    }

    /**
     * Method name : task1
     * Set the <i>double<i> variable <i>sum</i> to the value of
     *    1/1 + 1/2 + 1/3 + ... + 1/999 + 1/1000
     * @return The sum of reciprocals from 1 to 1000
     */
    public static double task1(double number) {
        double sum = 0.0; // Initialize sum to 0
        for(int i = 1; i <= 1000; i++) {
            sum += 1.0 / i; // Return the sum of reciprocals
        }
        return sum; // Return the sum
    }

    /**
      * Method name : task2
      * Set the <i>double</i> variable </i>sum</i> to the value of
      *     √100 + √200 + √300 + ... + √4900 + √5000
      * @return The sum of the square roots of all numbers from 100 to 5000 increasing by 100
      */
      public static double task2(double number) {
        double sum = 0.0;
        for(int i=100;i<number;i += 100) {
            sum += Math.sqrt(i);
        }
        return sum;
      }

    /**
     * Method name : task3
     * Set the <i>long</i> variable <i>product</i> to the value of
     *      1 x 2 x 3 x ... x 19 x 20
     * @return The product of all numbers from 1 to 20
     */
    public static long task3(long number) {
        long product = 1;
        for(int i=1; i<number; i++) {
            product *= i;
            System.out.println(product);
        }
        return product;
    }


    /**
     * Method name : task4
     * Set the <i>int</i> variable <i>total</i> to the value of
     *      (-12)³ + (-11)³ + (-10)³ + ... +  (19)³ + (20)³
     * @return The sum of all the cubes from -12 to 20
     */
    public static long task4(int number) {
        long total = 0;
        for (int i = -12; i <= 20; i++) {
            total += (long) Math.pow(i, 3);
        }
        return total;
    }
}
