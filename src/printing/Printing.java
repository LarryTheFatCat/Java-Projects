package printing;

/**
 * author: Tarkan Zarrouk
 * date: 11/09/2024
 * printing exercises
 */

/*
 * INSTRUCTIONS:
 * Complete each exersise. Instructions for each exercise is above the corresponding method.
 * To view the result of your exersice, uncomment the line that runs each method.
 */

public class Printing {
    public static void main(String[] args) {
        // exercise1();
        exercise2();
        // exercise3();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Exercise 1:
     * 
     * Write a single Java statement that would print the following, exactly as shown
     * --------------------
     * |  A slash is "/"
     * |  while
     * |  a backslash is "\"
     * |  but now we call "\" a forward slash :/"
     * --------------------
     */
    public static void exercise1() {
        System.out.println("A slash is \"/\"\nwhile\na backslash is \"\\\"\nbut now we call \"\\\" a forward slash :/\"");
    }

    /**
     * Exercise 2:
     * 
     * The following program contains a number of errors. Rewrite the program with the errors corrected (In a separate file).
     * (Right click on printing > New Java File > BadForm.java)
     * Once it runs correctly, using print statements, print out the correct program to the console (including new lines and tab characters)
     * 
     * --------------------
     * |  public class BadForm
     * |   public void main (string() args); {
     * |       System.Out.Println('What's wrong with this?')
     * |   }
     * --------------------
     */
    public static void exercise2() {
        System.out.println("public class BadForm {\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(\"What's wrong with this?\");\n\t}\n}");
    }

    /**
     * Exercise 3:
     * Write a program to print your name in giant letters as shown below (You must use at least 4 letters, nicknames are allowed)
     * 
     * --------------------
     * |  H    H      A      BBBB    IIIII    BBBB
     * |  H    H     A A     B   B     I      B   B
     * |  H    H    A   A    B   B     I      B   B
     * |  HHHHHH    AAAAA    BBBB      I      BBBB
     * |  H    H    A   A    B   B     I      B   B
     * |  H    H    A   A    B   B     I      B   B
     * |  H    H    A   A    BBBB    IIIII    BBBB
     * --------------------
     */
    public static void exercise3() {
            System.out.println("T T T T AAAAA  RRRR   K   K AAAAA  N   N");
            System.out.println("  T T   A   A  R   R  K  K  A   A  NN  N");
            System.out.println("  T T   AAAAA  RRRR   KKK   AAAAA  N N N");
            System.out.println("  T T   A   A  R  R   K  K  A   A  N  NN");
            System.out.println("  T T   A   A  R   R  K   K A   A  N   N");
            
    }
}
    /**
     * Exercise 3:
     * Write a program to print your name in giant letters as shown below (You must use at least 4 letters, nicknames are allowed)
     * 
     * --------------------
     * |  H    H      A      BBBB    IIIII    BBBB
     * |  H    H     A A     B   B     I      B   B
     * |  H    H    A   A    B   B     I      B   B
     * |  HHHHHH    AAAAA    BBBB      I      BBBB
     * |  H    H    A   A    B   B     I      B   B
     * |  H    H    A   A    B   B     I      B   B
     * |  H    H    A   A    BBBB    IIIII    BBBB
     * --------------------
     */
