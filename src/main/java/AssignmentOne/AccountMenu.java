package AssignmentOne;

import java.util.Scanner;

/**
 * A Menu to let the user choose what to do with Account
 * <pre>
 * Create an account menu that checks the debit balance when added and subtracting from it
 * make sure you credit negatives
 * Create an invoice menu that checks for negatives in the product and invoice class
 * print the invoice with the line items and the total
 * </pre>
 */
public class AccountMenu {

    public static void main(String[] args) {
        System.out.println("Account");

        Scanner input = new Scanner(System.in);
        char c; //Char to get menu choice

        System.out.println("Enter a name for the account..");
        String name =  input.next();

        System.out.println("Enter a balance as a float for the account..");
        Double totalBalance = input.nextDouble();

        Account account = new Account(name, totalBalance);
        do{
            printMenu();
            //Grab the user input
            c = Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\nEcho: %c\n", c);

            if(c=='A'){
                //TODO: Get user to input amount (Negative or positive) and display name and updated balance
                System.out.println("Enter an amount to deposit:");
                double addBalance = input.nextDouble();
                account.credit(addBalance);
                AccountTester.printAccountInfo(account);
            }

            if(c=='B'){
                //TODO: get user to input withdraw amount and display name with updated balance
                System.out.println("Enter an amount to Withdraw:");
                double withdrawBalance = input.nextDouble();
                account.debit(withdrawBalance);
                AccountTester.printAccountInfo(account);
            }

            if(c=='C'){
                //TODO: Reset balance in Account to 0
                account.setName("Account");
                // account.setBalance(0.0);
                AccountTester.printAccountInfo(account);
            }


        }while(c!='Z');
    }

    public static void printMenu(){
        System.out.println("\n\nWhat would you like to do?");
        System.out.println("(A) Deposit");
        System.out.println("(B) Withdraw ");
        System.out.println("(C) Reset Balance");
        System.out.println("(Z) Quit");
    }}
