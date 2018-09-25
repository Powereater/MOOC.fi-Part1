import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SteveWang
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starcount;
    
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.starcount = 0;
    }
    
    
    public NightSky(double density) {
        this(density,20,10);        
    }
    
    
    public NightSky(int width, int height) {
        this(0.1,width,height);
    }
    
    
    public void printLine(){
        Random random = new Random();
        
        double gen = 0;
        for ( int i = 0; i < this.width; i++ ) {
            gen = random.nextDouble();    
            if (gen <= this.density) {
                System.out.print("*");
                this.starcount++;
            }
            else {
                System.out.print(" ");
            }
        }
              
    }
    
    public void print(){
        this.starcount = 0;
        for ( int i = 0; i < this.height; i++ ){
            this.printLine();
            System.out.println();
        }
        
        
    }
    
    public int starsInLastPrint(){
        return this.starcount;
    }
    
}
