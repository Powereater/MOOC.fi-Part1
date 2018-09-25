import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public Person(String name) {
        this(name,Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1,Calendar.getInstance().get(Calendar.YEAR));
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int a = Calendar.getInstance().get(Calendar.DATE);
        int b =Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int c = Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate date = new MyDate(a,b,c);
        
        
        return this.birthday.differenceInYears(date);
    }
    
    public boolean olderThan(Person compared) {
        return this.birthday.earlier(compared.birthday);
        
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
}
