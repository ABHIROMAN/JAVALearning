import java.util.*;

public class ifelse{

    public static void main(String args[]){

        //Checking age greater then 18

        // Scanner sc = new Scanner(System.in); 
        // int age = sc.nextInt();

        // if (age > 18){
        //     System.out.println("Adult");
        // } else {
        //     System.out.println("Not Adult");
        // }

        // Checking Odd and Even 

        // Scanner sc = new Scanner(System.in); 
        // int x = sc.nextInt();

        // if (x % 2 == 0) {
        //     System.out.println("Even");
        // } else{
        //     System.out.println("Odd");
        // }

        //Checking number less, greater or equal to a

        // Scanner sc = new Scanner(System.in); 
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a==b) {
        //     System.out.println("Equal");
        // } else if (a > b){
        //         System.out.println("a is greater");
        // } else {
        //         System.out.println("a is lesser");
        //     }


        // Printing hello in different languages 
        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // if(button == 1) {
        //     System.out.println("Hello");
        // }else if (button == 2) {
        //     System.out.println("Namaste");
        // }else if(button == 3) {
        //     System.out.println("Bonjour");
        // }else {
        //     System.out.println("Invalid button");
        // }

        //SWITCH CONCEPT IN java
        //doing above question  using switch

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid button");
        }
    }
}