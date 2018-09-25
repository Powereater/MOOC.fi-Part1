
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    //private int aon;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;// initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;// code here
        this.sum = this.sum + number;
        
    }

    public int amountOfNumbers() {
        
        
        return this.amountOfNumbers;// code here
    }
    public int sum() {
        return sum;// code here
    }

    public double average() {
        if (amountOfNumbers == 0) {
            return 0;
        }
        else {
            return 1.0 * sum() / amountOfNumbers();
        }
        
                
    }
}
