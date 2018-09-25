
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        return new Money(this.euros() + added.euros(), this.cents() + added.cents());
    }
    
    public Money minus(Money decremented) {
        int cent = this.cents() - decremented.cents();
        int euro = this.euros() - decremented.euros();
        if (cent < 0){
            cent = cent + 100;
            euro--; 
        }
        
        if (euro < 0 ) {
            return new Money(0,0);
        }
        return new Money(euro,cent);
            
                    
    }
    
    public boolean less(Money compared) {
        if (this.euros() < compared.euros()) {
            return true;
        }
        
        else if (this.euros() == compared.euros()){
            if (this.cents() < compared.cents()) {
                return true;
            }
            else {
                return false;
            }
        }
        
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
