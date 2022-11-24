package AssignmentThree;

import AssignmentOne.Account;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExecutionProcedureAccounts {
    String DEFAULT_Name_EX = "Harold Shipman";
    double DEFAULT_BALANCE_EX = 2000.00;
    Account procedureAccount = new Account(DEFAULT_Name_EX, DEFAULT_BALANCE_EX);


    @BeforeAll
    public static void beforeClass() {
        System.out.println("\nBeginning Account tests");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("\nAfter Account tests");
    }

    //test case 1
    @Test
    public void testCase1() {
        procedureAccount.credit(-500.00);
        assertEquals(DEFAULT_BALANCE_EX - 500.00, procedureAccount.getBalance());
        System.out.printf("test case 1\n Name: %s Balance: %.2f\n", procedureAccount.getName(), procedureAccount.getBalance());
    }

    //test case 2
    @Test
    public void testCase2() {
        procedureAccount.credit(500.00);
        assertEquals(DEFAULT_BALANCE_EX + 500.00, procedureAccount.getBalance());
        System.out.printf("test case 2\n Name: %s Balance: %.2f\n", procedureAccount.getName(), procedureAccount.getBalance());
    }

    //test case 3
    @Test
    public void testCase3() {
        procedureAccount.debit(-1000.00);
        assertEquals(DEFAULT_BALANCE_EX - 1000.00, procedureAccount.getBalance());
        System.out.printf("test case 3\n Name: %s Balance: %.2f\n", procedureAccount.getName(), procedureAccount.getBalance());
    }

    //test case 4
    @Test
    public void testCase4() {
        procedureAccount.debit(3500.00);
        assertEquals(DEFAULT_BALANCE_EX - 3500.00, procedureAccount.getBalance());
        System.out.printf("test case 4\n Name: %s Balance: %.2f\n", procedureAccount.getName(), procedureAccount.getBalance());
    }

    //test case 5
    @Test
    public void testCase5() {
        procedureAccount.debit(1000.00);
        assertEquals(DEFAULT_BALANCE_EX - 1000.00, procedureAccount.getBalance());
        System.out.printf("test case 5\n Name: %s Balance: %.2f\n", procedureAccount.getName(), procedureAccount.getBalance());

    }

    //test case 6
    @Test
    public void testCase6() {
        procedureAccount.reset();
        assertEquals(0, procedureAccount.getBalance());
        System.out.printf("test case 6\n Name: %s Balance: %.2f\n", procedureAccount.getName(), procedureAccount.getBalance());

    }
}
