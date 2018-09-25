
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("type another number: ");
        int an_number = Integer.parseInt(reader.nextLine());
        double result = (double)number / an_number;
        System.out.print("Division: " + number + " / " + an_number + " = " + result);
        // Implement your program here. Remember to ask the input from user.
    }
}
