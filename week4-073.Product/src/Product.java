/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class Product {
    private String name;
    private int amount;
    private double price;
    
    public Product (String nameAtStart, double priceAtStart,int amountAtStart) {
        this.name = nameAtStart;
        this.amount = amountAtStart;
        this.price = priceAtStart;
        
    }
    public void printProduct() {
        System.out.println(name +", price " + price + ", amount " +amount);
    }
}
