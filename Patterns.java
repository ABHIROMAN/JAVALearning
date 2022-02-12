import java.util.*;

public class Patterns {

    public static void main(String args[]) {

        //PRINTING SOLID RECTANGLE
        // int n = 4;
        // int m = 5;

        // //outer loop
        // for(int i = 1; i<=n; i++) {
        //     //inner loop
        //     for(int j=1; j<=m; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //PRINTING HOLLOW RECTANGLE
        // int n = 4;
        // int m = 5;

        // //outer loop
        // for(int i=1; i<=n; i++) {
        //     //inner loop
        //     for(int j=1; j<=m; j++) {
        //         //cell -> (i,j)
        //         if(i == 1 || j==1 || i==n || j==m){
        //             System.out.print("*");
        //         }else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        //PRINTING HALF PYRAMID
        // int n = 4;
        // //outer loop 
        // for(int i=1; i<=n; i++) {
        //     //inner loop
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        
        //PRINTING INVERTED HALF PYRAMID
        // int n = 4;
        // //outer loop 
        // for(int i=n; i>=1; i--) {
        //     //inner loop
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //PRINTING INVERTED HALF PYRAMID ROTATED BY 180
        // int n = 4;
        // //outer loop
        // for(int i=1; i<=n; i++) {
        //     //inner loop --> space println
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }
        //     //inner loop --> star print
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        //HALF PYRAMID WITH NUMBERS
        // int n = 5;

        // //outer loop
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //INVERTED HALF PYRAMID WITH NUMBERS
        // int n = 5;
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=n-i+1; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //PRINTING FLLOYD'S TRIANGLE
        // int n = 5;
        // int number =1;
        // //outer loop
        // for(int i=1; i<=n; i++){
        //     //inner loop
        //     for(int j=1; j<=i; j++){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();
        // }

        //PRINTING 0-1 TRIANGLE
        int n = 5;
        //outer loop
        for(int i=1; i<=n; i++){
            //inner loop
            for(int j=1; j<=i; j++) {
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }System.out.println();
        } 

    }
}