import java.util.Scanner;

public class gcdEuclidean {
    

    public static int findGCD(int a, int b) {
        //Base case
        if(b == 0) {
            return a;
        }
        return findGCD(b, a%b);
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = sc.nextInt();
        System.out.println("Please enter the second number");
        int b = sc.nextInt();

        System.out.println("GCD of two numbers "  + a + " and " + b + " is :" + findGCD(a,b));

        
    }
}
