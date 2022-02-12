import java.util.*;

public class Butterfly_pattern {

    public static void main(String args[]) {
        //outer loop
        int n = 5;

        //Upper half of butterfly
        for(int i = 1; i<=n; i++) {
            //1st part of butterfly
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces 
            int spaces = 2 * (n-i);
            for(int j =1; j<=spaces; j++) {
                System.out.print(" ");
            }

            //2nd part 
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half of butterfly
        for(int i = n; i>=1; i--) {
            //1st part of butterfly
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces 
            int spaces = 2 * (n-i);
            for(int j =1; j<=spaces; j++) {
                System.out.print(" ");
            }

            //2nd part 
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}