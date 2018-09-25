import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        //System.out.println(text);
        //System.out.println(reverse(text));
        //String boob = "boob";
        if (reverse(text).equals(text)) {
            return true;
        }
        
        // write code here
        return false;
    }
    public static String reverse(String text) {
             String result = "";

 

        // then the rest is copied to it one by one at reverse order

        int i = text.length() - 1;

        while (i >= 0) {

            result += text.charAt(i);  // same as result = result + text.charAt(i); 

            i--;

        }

 

        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
