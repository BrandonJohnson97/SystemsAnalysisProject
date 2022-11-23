package AssignmentOne;

/**
 * A Class to test the Account class
 */
public class AccountTester {
    public static void main(String[] args) {
        System.out.println("Account Tester Class!");

        //TEST 1 : Create an account and echo out the details
        Account account = new Account("Brandon Johnson", 0.00);
        printAccountInfo(account);

        //TEST 2: Deposit and check the balance
        System.out.println("Deposit 20 dollars....");
        account.credit(20.00);
        printAccountInfo(account);

        //TEST 3: Deposit a Negative amount
        System.out.println("Deposit negative amount");
        account.credit(-20.00);
        printAccountInfo(account);

        //TEST 4: debit money from the account
        System.out.println("Debit 20 dollars..");
        account.debit(20.00);
        printAccountInfo(account);

        //TEST 5: debit negative money from the account
        System.out.println("Debit -900 dollars..");
        account.debit(-900.00);
        printAccountInfo(account);
    }
    public static void printAccountInfo(Account account){
        System.out.printf("\nAccount name: %s Balance: %.2f\n", account.getName(), account.getBalance());
    }
}
