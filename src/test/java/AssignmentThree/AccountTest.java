package AssignmentThree;

import AssignmentOne.Account;
import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * <pre>
 *     Using the Account class from the first Java assignment do the following:
 *  Do assertion tests on all setter / getter methods
 *  Test negative balance in the constructor
 *  Use Execution Procedure (see tutorial) to test the following:
 * o Creation of account with correct balance
 * o Credit negative amount (fails)
 * o Credit positive amount (works)
 * o Debit negative amount (fails)
 * o Debit amount larger than balance (fails)
 * o Debit amount less than balance (passes)
 * o Correct final balance
 * </pre>
 * @author 20168209
 */
public class AccountTest {

    Account account;
    private static String DEFAULT_NAME = "Test Account";
    private static double DEFAULT_BALANCE = 200.00;

    @BeforeAll
    public static void beforeClass() {System.out.println("\nBeginning Account tests");}

    @AfterAll
    public static void afterClass() {System.out.println("\nAfter Account tests");}

    @BeforeEach
    public void before() {account = new Account(DEFAULT_NAME, DEFAULT_BALANCE);}

    @AfterEach
    public void after() {
        System.out.printf("\nAccount name: %s Balance: %.2f", account.getName(), account.getBalance());
    }
    @DisplayName("Test accounts get name")
    @Test
    void getName(){
        assertEquals(DEFAULT_NAME, account.getName());
        final String name = "Edmund Kemper";
        account.setName(name);
        assertEquals(name, account.getName());
    }

    @DisplayName("Test accounts set name")
    @Test
    void setName(){
        final String name = "John Wayne Gacy";
        account.setName(name);
        assertEquals(name, account.getName());
    }

    @DisplayName("Test accounts get balance")
    @Test
    void getBalance(){
        assertEquals(DEFAULT_BALANCE, account.getBalance());
    }

    @DisplayName("Test accounts constructor")
    @Test
    void constructor(){
        final double negativeBalance = -200;
        account = new Account(DEFAULT_NAME, negativeBalance);
        assertEquals(0, account.getBalance());
    }

    @DisplayName("Execution Procedure")
    @Test
    void procedure(){
        Account procedureAccount;
        String DEFAULT_NAME = "Execute Procedure";
        double DEFAULT_BALANCE = 2000.00;

        procedureAccount = new Account(DEFAULT_NAME, DEFAULT_BALANCE);

        procedureAccount.credit(-500.00);
        assertEquals(DEFAULT_BALANCE, procedureAccount.getBalance());

        procedureAccount.credit(500.00);
        assertEquals(2500.00, procedureAccount.getBalance());

        procedureAccount.debit(-1000.00);
        assertEquals(2500.00, procedureAccount.getBalance());

        procedureAccount.debit(3500.00);
        assertEquals(2500.00, procedureAccount.getBalance());

        procedureAccount.debit(1000.00);
        assertEquals(1500.00, procedureAccount.getBalance());

        procedureAccount.reset();
        assertEquals(0, procedureAccount.getBalance());

    }
//    @DisplayName("Test accounts credit")
//    @Test
//    void credit(){
//        account.credit(100);//if balance is negative balance doesn't change
//        assertEquals(300, account.getBalance());
//
//        account.credit(-200);
//        assertEquals(300, account.getBalance());
//
//        account.credit(201);
//        assertEquals(501, account.getBalance());
//
//        account.credit(-150);
//        assertEquals(501, account.getBalance());
//
//        account.credit(0);
//        assertEquals(501, account.getBalance());
//
//        account.credit(501);
//        assertEquals(1002, account.getBalance());
//    }
//
//    @DisplayName("Test accounts debit")
//    @Test
//    void debit(){
//        account.debit(100);//if balance is negative balance doesn't change
//        assertEquals(100, account.getBalance());
//
//        account.debit(-200);
//        assertEquals(100, account.getBalance());
//
//        account.debit(201);
//        assertEquals(100, account.getBalance());
//
//        account.debit(-150);
//        assertEquals(100, account.getBalance());
//
//        account.debit(1);
//        assertEquals(99, account.getBalance());
//
//        account.debit(66);
//        assertEquals(33, account.getBalance());
//        }
}
