//Take an array of names as Input from the user and print them on screen. 

import java.util.*;

public class Array1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String names[] = new String[size];

        //input string
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }

        //output string
        for(int i=0; i<names.length; i++) {
            System.out.println("name " + (i+1) + " is : " + names[i]);
        }
    }
}