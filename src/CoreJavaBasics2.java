//import java.util.Scanner;

/**/
public class CoreJavaBasics2 {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

/*
        //1. Convert the following to binary: 1, 8, 33, 78, 787, 33987. Uses toBinaryString() method.
        //Try a custom conversion.
        int[] dec = {1, 8, 33, 78, 787, 33987};

        for(int i = 0; i < dec.length; i++) {
            System.out.println("Binary of " + dec[i] + " is " + Integer.toBinaryString(dec[i]));
        }//End problem 1

        //2. Convert the following to decimal: 0010, 1001, 00110100, 01110010, 001000011111, 0010110001100111.
        String[] bin = {"0010", "1001", "00110100", "01110010", "001000011111", "0010110001100111"};

        for(int i = 0; i < bin.length; i++) {
            System.out.println(Integer.parseInt(bin[i],2));
        }//End for

        //3. Int x = 2 print binary exp of x. Left shift (<<) and assign result to x
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x <<= 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        int[] nums = {9, 17, 88};
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            System.out.println(Integer.toBinaryString(nums[i]));
            x <<= nums[i];
            System.out.println(x);
            System.out.println(Integer.toBinaryString(x));
        }//End for

        //4. x = 150 print out binary of x. Right shift x by 2 and assign it the result and print the value of x.
        //Do it again with the following values: 225, 1555, 32456
        x = 150;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x >>= 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        int[] num = {225, 1555, 32456};
        for(int i = 0; i < nums.length; i++) {
            x = num[i];
            x >>= 2;
            System.out.println(num[i]);
            System.out.println(x);
            System.out.println(Integer.toBinaryString(x));
        }//End for

*/
        //5. Declare 3 int x =7, y = 17, z. Use bitwise & (just one & symbol) on x and y and comment what you think
        //the result will be. Assign that result to z. Then use bitwise or (|) on x & y and assign it to z. Comment
        //what you think the result will be.
        int x = 7, y = 17, z = 0;
        //No idea what this is even doing. Gotta read more on it.
        z = x & y;
        System.out.println("x & y = " + (x & y));
        System.out.println(z);
        z = x | y;
        System.out.println("x & y = " + (x | y));
        System.out.println(z);

        //6. Create an int assign it a value and do a postfix increment on it. Print the value before and after.
        x = 200;
        System.out.println(x);
        x++;
        System.out.println(x);

        //7. Demonstrate 3 ways to increment a variable by 1 and do it multiple times. Assign a value, print it,
        //increment it, print it again, increment and print it again.
        x = 0;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x+= 1;
        System.out.println(x);
        x++;
        System.out.println(x);

        //8. x =5 y = 8. Use z and assign it to the value of ++x + y. Then postfix x and see the result.
        x = 5;
        y = 8;
        z = ++x + y;
        System.out.println(z);
        z = y + x++;
        System.out.println(z);

    }//End of main
}//End of main method