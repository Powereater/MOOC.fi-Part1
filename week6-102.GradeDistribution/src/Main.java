import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");
        int number = 0;
        int starcounter0 = 0;
        int starcounter1 = 0;
        int starcounter2 = 0;
        int starcounter3 = 0;
        int starcounter4 = 0;
        int starcounter5 = 0;
        //int other =0;
        while (number != -1) {
         number = Integer.parseInt(reader.nextLine());
         
         if (number == -1){
             break;
             
         }
         else if (0 < number && number <= 29){
             starcounter0++;
             
         }
         
         
         else if (29 < number && number <= 34){
             starcounter1++;
             
         }
          else if (34 < number && number <= 39){
             starcounter2++;
             
         } else if (39 < number && number <= 44){
             starcounter3++;
             
         } else if (44 < number && number <= 49){
             starcounter4++;
             
         } else if (49 < number && number <= 60){
             starcounter5++;
             
         }
         
         
        }
        System.out.print("Grade distribution:");
        System.out.println("5: " + print(starcounter5));
        
        System.out.println("4: " + print(starcounter4));
        
        System.out.println("3: " + print(starcounter3));
        
        System.out.println("2: " + print(starcounter2));
        
        System.out.println("1: " + print(starcounter1));
        
        System.out.println("0: " + print(starcounter0));
        
        double acptperceet = 100.0*( starcounter1 + starcounter2 + starcounter3 + starcounter4 + starcounter5)/(starcounter0 + starcounter1 + starcounter2 + starcounter3 + starcounter4 + starcounter5);
        System.out.println("Acceptance percentage: " + acptperceet);
         //while (i)
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
    public static String print(int number) {
        
        int i = 0;
        String stars = "";
        while (i < number) {
            stars = stars + "*";
            i++;

        }
        return stars;
    // ...
    }
}
