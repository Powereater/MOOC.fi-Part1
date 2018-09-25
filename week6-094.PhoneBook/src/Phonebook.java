
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Phonebook {
    private ArrayList<Person> people;
    
    public Phonebook () {
        this.people = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        
        this.people.add(new Person(name, number));
        
    }
    
    public void printAll() {
        for (Person indv : this.people) {
            System.out.println(indv);
        }
    }
    
    public String searchNumber(String name) {
        //int trigger = 0;
       for (Person indv : this.people) {
            if (indv.getName().equals(name)){
                return indv.getNumber();
                
            }
        }
       return "number not known";
    }
}
