
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        
        //System.out.print("Type your password: " );
        //rabbitString pass = reader.nextLine();// Use carrot as password when running tests.
        while (true){
           System.out.print("Type the password: " );
           String pass = reader.nextLine();
           if (pass.equals(password)) {
               System.out.print("Right! "
                       + ""
                       + "The secret is: jryy qbar!" );
               break;
           }
           System.out.print("Wrong!" );
        }
        // Write your code here
    }
}
