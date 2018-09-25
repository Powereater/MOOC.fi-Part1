import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        Random random = new Random();
        
        this.numbers = new ArrayList<Integer>();
        
        while (numbers.size() < 7) {
           int gen = random.nextInt(39) + 1;
        
            if (!containsNumber(gen)) {
                this.numbers.add(gen);
            } 
        }
        
            
        
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
            int counter = 0;
        for (Integer numb : this.numbers) {
            if (numb == number) {
                counter++;
            }
           
        }
        if (counter > 0){
            return true;
        }
        else{
            return false;
        }
// Test here if the number is already in the drawn numbers
        
    }
}
