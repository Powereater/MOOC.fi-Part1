/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Person {
    private String name;
    private String numbers;
    
    public Person(String name, String numbers){
        this.name = name;
        this.numbers = numbers;
        
    } 
    
    public void changeNumber(String newNumber) {
        this.numbers = newNumber;
    }
    
    public String getName(){
        return this.name;
        
    }
    
    public String getNumber(){
        return this.numbers;
    }
    
    
    public String toString() {
        return this.name + "  number: " + this.numbers;
    }
}
