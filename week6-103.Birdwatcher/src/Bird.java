/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Bird {
    private String name;
    private String latinname;
    private int numberObserved;
    
    
        public Bird(String name, String latinname) {
            this.name = name;
            this.latinname = latinname;
            this.numberObserved = 0;
        }
        
        public String getName() {
            return this.name;
        }
        
        public void observed() {
            this.numberObserved++;
        }
        
        public String toString() {
            return this.name + " (" + this.latinname + "): " + this.numberObserved + " observations";
        }
            
    
}
