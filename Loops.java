import java.util.*;

public class Loops {

    public static void main(String args[]) {
        //Using for loops here
        // for(int counter = 0;counter < 3; counter = counter + 1) {
        //     System.out.println("Hello world");

        //Printing numbers from 0 to 10   
        //counter++ --> counter = counter + 1
        // for(int counter = 0; counter < 11; counter++){
        //     // System.out.println(counter);
        //     System.out.print(counter+" ");//Printing in single line
        // } 

        // for (int i =0; i < 11; i++){
        //     System.out.println(i);
        // }

        //USING WHILE LOOPS 
        // int i = 0;
        // while(i < 11) {
        //     System.out.println(i);
        //     i = i + 1;
        // }

        //USING DO WHILE LOOPS
        // int i = 0;
        // do {
        //     System.out.println(i);
        //     i = i + 1;
        // }while (i < 11);

        // int i = 12;
        // while (i < 11){
        //     System.out.println("Hello World");
        // }

        // do{
        //     System.out.println("Hello");
        // } while(i < 11);

        //PRINT SUM OF FIRST N numbers
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int sum = 0;
        // for(int i=0; i<=n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);


        //PRINT THE TABLE OF A NUMBER INPUT BY USER
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<11; i++) {
            System.out.println(i*n);
        }  

    }
}
