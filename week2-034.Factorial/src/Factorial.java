import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int level = Integer.parseInt(reader.nextLine());
        int numb = 0;
        //int res = 0;
        int tally = 0;
        while (numb <= level){
            int res = (int)Math.pow(2, numb);
            numb++;
            tally = tally + res;
        }
        System.out.print("Factorial is " + tally);
    }
}
