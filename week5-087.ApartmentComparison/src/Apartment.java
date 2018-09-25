
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        else{
            return false;
        }
    }
     public int priceDifference(Apartment otherApartment) {
         int thisApart = this.pricePerSquareMeter * this.squareMeters;
         int thatApart = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
         if (thisApart > thatApart) {
             return thisApart - thatApart;
         }
         else {
             return thatApart - thisApart;
         }
     }
     public boolean moreExpensiveThan(Apartment otherApartment) {
         int thisApart = this.pricePerSquareMeter * this.squareMeters;
         int thatApart = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
         if (thisApart > thatApart) {
             return true;
         }
         else {
             return false;
         }
     }
}
