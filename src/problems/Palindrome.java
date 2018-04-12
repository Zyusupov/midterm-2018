package problems;
import java.util.*;


public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


        Scanner inputString = new Scanner(System.in);

        System.out.println("enter your string");
        String str = inputString.next();
        inputString.close();
        String revString = "";

        char[] ch = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            revString = revString + ch[i];
        }
//        System.out.println(revString);

        if (str.equals(revString)) {
            System.out.println(revString + "  is a palindrome ");
        }
        else
            System.out.println(revString+ " is not a palindrome");
    }
}





