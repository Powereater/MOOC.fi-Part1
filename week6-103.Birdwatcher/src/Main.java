import java.util.ArrayList;
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    //Birdlist journal = new Birdlist();
    ArrayList<Bird> Journal = new ArrayList<Bird>();
    String command = "";
    String name ="";
    String latinname = "";
    
    
    //Bird newbird
    
    
    while (!command.equals("Quit")) {
       System.out.print("?: "); 
       command = reader.nextLine();
       
       if (command.equals("Add")) {
           System.out.print("Name: ");
           name = reader.nextLine();
           System.out.print("Latin Name: ");
           latinname = reader.nextLine();
           Bird newbird = new Bird(name, latinname);
           Journal.add(newbird);
       }
       
       if (command.equals("Observation")) {
           System.out.print("What was observed:? ");
           name = reader.nextLine();
           int counter = 0;
           for ( Bird i : Journal ){
               if (i.getName().equals(name)) {
                   i.observed();
                   counter++;
               }
           }
           
           if (counter == 0){
               System.out.println("Is not a bird!");
           }
           
           
           
       }
       
       
       if (command.equals("Statistics")) {
           
           for ( Bird i : Journal ){
               
                   System.out.println(i);
                   //counter++;
               
           }
           
           
       }
       
       if (command.equals("Show")) {
           System.out.println("What? ");
           name = reader.nextLine();
           int counter = 0;
           for ( Bird i : Journal ){
               if (i.getName().equals(name)) {
                   System.out.println(i);
                   //i.observed();
                   counter++;
               }
           }
           
           if (counter == 0){
               System.out.println("Is not a bird!");
           }
           
           
           
       }
       
    }
    
    
// implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }

}
