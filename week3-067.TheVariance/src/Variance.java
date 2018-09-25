import static java.lang.Math.sqrt;
import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer numb : list) {
            sum = sum + numb;
        
    
        
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        //int total = sum(list);
        //System.out.print("used");
        return 1.0 * sum(list) / list.size()* 1.0;
        //return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double vtol = 0.0;
        double avg = average(list);
        for (Integer numb : list){
            
            vtol =(numb - avg)*(numb - avg)+ vtol;
        }
    // write code here
        return vtol / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        
        System.out.println("The variance is: " + variance(list));
    }

}
