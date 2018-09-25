
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int start = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int end = Integer.parseInt(reader.nextLine());
        //int numb = 0;
        int tally = start;
        while (start < end){
            start ++;
            tally = tally + start;
        }
        System.out.print("Sum is " + tally);
    }
}
