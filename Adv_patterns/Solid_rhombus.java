import java.util.*;

public class Solid_rhombus {

    public static void main(String args[]) {

        int n = 5;
        //outer loop
        for(int i=1; i<=n; i++) {
            //spaces between
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}