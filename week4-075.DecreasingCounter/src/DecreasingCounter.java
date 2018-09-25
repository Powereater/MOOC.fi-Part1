public class DecreasingCounter {
    private int value;
    private int valueAS;// instance variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.valueAS = valueAtStart;
        this.value = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0) {
           value--; 
        }
        
        // write here code to decrease counter value by one
    }
    public void reset(){
        value = 0;
    }
    public void setInitial(){
        value = valueAS;
    }

    // and here the rest of the methods
}
