import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int length;
    
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length = length;// Initialize the variable
    }

    public String createPassword() {
        
        String result = "";
        int i = 0;
        while (i < length) {
            int number = random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            result = result + symbol;
            i++;
            
        }
        // write code that returns a randomized password
        return result;
    }
}
