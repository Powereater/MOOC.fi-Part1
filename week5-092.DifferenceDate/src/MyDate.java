public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    public int differenceInYears(MyDate comparedDate){
        int dif = (this.year - comparedDate.year);
        if (comparedDate.earlier(this)) {
        
        
        if (this.month-comparedDate.month <0){
            dif = (dif -1);
        }
        if (this.month == comparedDate.month) {
            if (this.day - comparedDate.day < 0)
                dif = (dif -1);
        }   
        }
        else{
                 dif = ( comparedDate.year - this.year);
        if (comparedDate.month-this.month<0){
            dif = (dif -1);
        }
        if (this.month == comparedDate.month) {
            if ( comparedDate.day - this.day< 0)
                dif = (dif -1);
        } 
            
        }
        return dif;
    }
        

}
