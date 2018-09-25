
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        int check = 1;
        while (check == 1) { 
        System.out.println("Type a word: ");
        String name = reader.nextLine();
        
        if ( name.isEmpty() ) { 
        check = 0;
        
        }
        else {
            words.add(name); 
        }
               
        }
        Collections.sort(words);
        System.out.println("you have typed the following words:");
        for (String word : words) {
        System.out.println( word );
    }
    }
}
