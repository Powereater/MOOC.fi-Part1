import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        System.out.println("type numbers");
        int s = 0;
        while (s != -1) {
            s = Integer.parseInt(reader.nextLine()); 
            if (s != -1) {
                if ((s%2) == 0) {
                    even.addNumber(s);//even
                }
                else {
                    odd.addNumber(s);
                }
               stats.addNumber(s); 
            }
            
        }
       
        
        //stats.addNumber(3);
        //stats.addNumber(5);
        //stats.addNumber(1);
        //stats.addNumber(2);
        //System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
        
        //System.out.println("average: " + stats.average());
    }
}
