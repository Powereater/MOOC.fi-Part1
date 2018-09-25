
public class Accounts {

    public static void main(String[] args) {
        
    Account A = new Account("A account",100.00);
    Account B = new Account("B account",0.00);
    Account C = new Account("C account",0.00);
    
    transfer(A,B,50.0);
    transfer(B,C,25.0);
    
    
        // Code in Account.Java should not be touched!
        // write your code here
    }
    public static void transfer(Account from, Account to, double howMuch) {
    from.withdrawal(howMuch);
    System.out.println(from + " account balance is now: "+from.balance());
    to.deposit(howMuch);
    System.out.println(to + " account balance is now: "+to.balance());

    System.out.println("Final state");
    System.out.println(from);
    System.out.println(to);    
    }


}
