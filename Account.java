

public class Account //Class Account
{ // Start of class Account
   private double balance;

   public Account(double initialBalance )
   {
      if ( initialBalance > 0.0 )
         balance = initialBalance;
   }

   public void credit(double amount )
   {
      balance = balance + amount;
   }

   double getBalance()
   {
      return balance;
   }
} // End of class Account