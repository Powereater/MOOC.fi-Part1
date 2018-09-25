
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int level = Integer.parseInt(reader.nextLine());
        int numb = 0;
        int tally = 0;
        while (numb < level){
            numb++;
            tally = tally + numb;
        }
        System.out.print("Sum is " + tally);

    }
}
