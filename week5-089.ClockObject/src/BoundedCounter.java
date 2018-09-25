
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;// write code here
    }

    public void next() {
        this.value++;
        if (this.upperLimit < this.value) {
        this.value = 0;
        }
        // write code here
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value; 
        }
        else {
            return "" + this.value;
        }
        // write code here
    }
    public int getValue() {
        return value;// write here code that returns the value
    }
    public void setValue(int setvalue) {
        if (0 <= setvalue && setvalue<= this.upperLimit) {
         
          this.value = setvalue;  
        }
        // write here code that returns the value
    }
}
