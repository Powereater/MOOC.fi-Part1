import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Type numbers:");
        int level = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int counter = 0;
        int odd = 0;
        int even = 0;
        
        while (-1 != level){
            sum = sum + level;
            int reminder = level % 2;
            if (reminder == 0){
                even++;
            }
            else {
                odd++;
            }
            level = Integer.parseInt(reader.nextLine());
            
            counter = counter + 1;
            
        }
        System.out.print("Thank you and see you later!");
        
        //if (counter > 0) {
        System.out.print("\n The sum is " + sum);
        System.out.print("\n How many numbers: " + counter);
        float average = (float) sum / counter;
        System.out.print("\n Average: " + average);
        System.out.print("\n Even numbers: " + even);
        System.out.print("\n Odd numbers: " + odd);   
        //}
        
        
    }
}
