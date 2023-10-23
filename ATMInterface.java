interface ATM
{
     void withdraw(int amount);
     void deposit(int amount);
     void checkbalance();
}
 class useraccount implements ATM 
{
     int balance=10000;
         public void withdraw(int amount)
         {
           balance=balance-amount;
           System.out.println( amount+" successfully debited");
          }
          public void deposit(int amount)
          {
            balance=balance+amount;
            System.out.println(amount+" successfully credited");
          }  
          public void checkbalance()
          {
            System.out.println("The available balance: "+balance);
          } 
}
public class ATMInterface
{
    public static void main(String[] args) {
        useraccount a=new useraccount();
        a.withdraw(3000);
        a.checkbalance();
        a.deposit(6000);
        a.checkbalance();
    }
}
