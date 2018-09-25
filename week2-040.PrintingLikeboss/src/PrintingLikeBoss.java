public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
         while (amount > 0) {
        System.out.print("*");  
        amount--;
        }
         System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0) {
        System.out.print(" ");  
        amount--;
        
        }
        //System.out.print("\n");
    }

    public static void printTriangle(int size) {
         int layer = 1;
        while ( layer <= size){
           printWhitespaces(size - layer) ;
           printStars(layer); 
           layer++;
           //System.out.print("\n");
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int layer = 1;
        while ( layer <= height){
           printWhitespaces(height - layer) ;
           printStars(2 * layer - 1); 
           //printWhitespaces(height - layer) ;
           layer++;
           //System.out.print("\n");
        }
        printWhitespaces(height - 2) ;
           printStars(3); 
           //printWhitespaces(height - 2);
           //System.out.print("\n");
           printWhitespaces(height - 2) ;
           printStars(3); 
           //printWhitespaces(height - 2);
    }
    

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
