
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        int check = 1;
        while (check == 1) { 
        System.out.println("Type a word: ");
        String name = reader.nextLine();
        
        if ( words.contains(name) ) { 
        System.out.println("You gave the word " + name + " twice");
        check = 0;
        }
        words.add(name);    
        }
        
        //String word = reader.nextLine(); 
    
    }
}
