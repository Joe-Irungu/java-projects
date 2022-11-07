import java.util.Scanner;

public class Account_test
{
    public static void main(String[] args )
    {
        Account account1 = new Account(100.00);
        Account account2 = new Account(-25.50);

// display initial balances
        System.out.printf( "account1 balance: %.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: %.2f\n\n", account2.getBalance() );

        Scanner input = new Scanner( System.in );
        double depositAmount; // deposit amount read from user

        System.out.print( "Enter deposit amount for account1: " ); // prompt
        depositAmount = input.nextDouble();

        System.out.printf( "\nadding %.2f to account1 balance\n\n", depositAmount );
        account1.credit(depositAmount); // add to account1 balance

        System.out.printf( "account1 balance: %.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: %.2f\n\n", account2.getBalance() );

        System.out.print( "Enter deposit amount for account2: " ); // prompt
        depositAmount = input.nextDouble();
        System.out.printf( "\nadding %.2f to account2 balance\n\n", depositAmount );
        account2.credit( depositAmount ); // add to account2 balance

        System.out.printf( "account1 balance: %.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: %.2f\n", account2.getBalance() );
    }



}
