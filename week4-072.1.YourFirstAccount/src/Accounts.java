
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's account",100.00);
        //Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        //System.out.println(bartosSwissAccount);

        //bartosAccount.withdrawal(20);
        //System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        bartosAccount.deposit(20);
        //System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        //System.out.println(bartosSwissAccount);

        // Code in Account.Java should not be touched!
        // write your code here
    }

}
