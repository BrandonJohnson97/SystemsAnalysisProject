package AssignmentOne;

/**
 * A class that creates an object of a bank account using a name and balance
 * <pre>
 * Modify class Account (from the course notes for Chapter 3) to provide a method called debit that
 * withdraws money from an Account. Ensure that the debit amount does not exceed the Account’s
 * balance. If it does, the balance should be left unchanged and the method should print a message
 * indicating "Debit amount exceeded account balance." Modify class AccountTest (Fig. 3.9 in course notes
 * for Chapter 3) to test method debit. (Note: modify the credit method so that it won’t credit a negative
 * amount as well.) Add a reset method that sets the balance to zero and create an application that allows
 * a user (from the console) to credit, debit, reset an account.
 * </pre>
 *
 * @author 20168209
 */
public class Account {
    private String name;
    private double balance;

    /**
     *If balance is greater than 0 then balance is equal to param balance
     * If name isn't empty, name is equal to param name
     *
     * @param name - String, account name
     * @param balance - Double, balance amount
     */
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        }
    }

    /**
     * Get the account name
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the account name
     *
     * @param name account name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the account balance
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * credit money into the account if amount is greater than 0
     *
     * @param amount amount to credit
     * @return Balance
     */
    public void credit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        }
    }

    /**
     * If amount is less than 0, subtract amount from balance
     * echo error if amount exceeds balance
     * {@code (amount < 0){
     *     balance -= balance;
     * }}
     *
     * @param amount
     * @return balance
     */
    public void debit(double amount) {
        if (amount > 0)  {
            if(balance >= amount){
                this.balance -= amount;
            } else {
                System.err.printf("\nAmount(%.2f) cannot be greater than balance(%.2f).", amount, balance);
            }
        } else {
            System.err.printf("\nDebit amount(%.2f) exceeded account balance(%.2f).", amount, balance);
        }
    }

    /**
     * Reset the balance!
     */
    public void reset(){
        //This method really shouldn't exist
        this.balance = 0;
    }
}