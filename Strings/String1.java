import java.util.*;

public class String1 {

    public static void main(String args[]) {
        //String Declaration
        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String sentence = "My name is Tony Stark";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is :"+ name);

        //concatenation string
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        //comparison string
        String name1 = "Tony";
        String name2 = "Tony";

        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        //substrings 
        String sentence = "My name is Tony";
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        //Strings are immutable


    }
}