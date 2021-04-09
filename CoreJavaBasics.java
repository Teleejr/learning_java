/*First Java file of exercises from class.

The exercises are based on Variables.
 */

public class CoreJavaBasics {

    public static void main(String[] args) {

        //Declare 2 int variables, initialize and add them together. Assign sum to variable and print result.
        int a = 7;
        int b = 4;
        int c = a + b;
        System.out.println(c);

        //Create and initialize 2 double variables, add them together with a new variable and print result.
        double d = 9.0;
        double e = 8.0;
        double f = d + e;
        System.out.println(e);

        //Create and initialize an int and a double, add them with a new variable and print result.
        int g = 3;
        double h = 6;
        double i = g + h;
        System.out.println(i);

        /*Create and initialize 2 int and divides the larger # by the smaller with a new variable.
        Change the larger # to a double. How do you achieve this?*/
        int j = 19.0;
        int k = 5.0;
        double l = k / j;
        System.out.println(l);

        /*Create and initialize 2 doubles, divide the larger by the smaller with a new variable and print.
        Cast the result as an int and print again.*/
        double m = 22.0;
        double n = 15.0;
        double o = n / m;
        System.out.println(o);
        System.out.println((int) o);



    } //End of main method
} //End of class