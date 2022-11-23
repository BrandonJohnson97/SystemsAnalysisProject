package AssignmentOne;
/**
 * A Menu to let the user choose what to do with the Invoices
 */

import java.util.Scanner;
//TODO: Code unit price
public class InvoiceMenu {
    public static void main(String[] args) {
        System.out.println("Invoice");

        Scanner input = new Scanner(System.in);
        char c; //Char to get menu choice

        LineItem lineItemOne = new LineItem(new Product(1,"Plasma TV", 999.99), 2);
        LineItem lineItemTwo = new LineItem(new Product(2,"Monitor", 249.59), 1);
        LineItem lineItemThree = new LineItem(new Product(3,"Keyboard", 99.00), 8);

        Invoice invoice = new Invoice(lineItemOne, lineItemTwo, lineItemThree);

        do{
            printMenu();
            //Grab the user input
            c = Character.toUpperCase(input.next().charAt(0));

            System.out.printf("\nEcho: %c\n", c);

            if(c=='A'){
                //TODO: Get Line Item, user inputs to get 1,2 or 3 amd displays product
                System.out.println("Enter an Int and get the Product with the Total(1,2 or 3)");
                int getInt = input.nextInt();
                invoice.getLineItem(getInt);
                LineItemTester.LineItemInfo(invoice.getLineItem(getInt));
            }

            if(c=='B'){
                //TODO: Set LineItem to another Line Item
                System.out.println("Enter an Int to get the LineItem you want to change(1,2 or 3)");
                int getInt = input.nextInt();
                System.out.println("Enter an Int to change the LineItem to(1,2 or 3)");
                int getNewInt = input.nextInt();
                invoice.setLineItem(getInt, invoice.getLineItem(getNewInt));
                System.out.printf("LineItem %d", getInt);
                LineItemTester.LineItemInfo(invoice.getLineItem(getInt));
                System.out.printf("LineItem %d", getNewInt);
                LineItemTester.LineItemInfo(invoice.getLineItem(getNewInt));

            }

            if(c=='C'){
                //TODO: Print out entire invoice with the total of all LineItems
                LineItemTester.LineItemInfo(invoice.getLineItem(1));
                LineItemTester.LineItemInfo(invoice.getLineItem(2));
                LineItemTester.LineItemInfo(invoice.getLineItem(3));
                System.out.printf("\nInvoice total: %.2f", invoice.getInvoiceTotal());
            }


        }while(c!='Z');
    }

    public static void printMenu(){
        System.out.println("\n\nWhat would you like to do?");
        System.out.println("(A) Get LineItem");
        System.out.println("(B) Set LineItem ");
        System.out.println("(C) Create Invoice");
        System.out.println("(Z) Quit");
    }
}
