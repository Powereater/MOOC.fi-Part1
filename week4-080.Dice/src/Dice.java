import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;// Initialize here the number of sides
    }

    public int roll() {
        return random.nextInt(this.numberOfSides)+1;// create here a random number belongig to range 1-numberOfSided
        //return 0;
    }
}