package AssignmentThree;

import AssignmentOne.Account;
import AssignmentOne.Employee;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * @author 20168209
 */
public class ExecutionProcedureEmployee {
    private static String DEFAULT_FIRST_EX = "David";
    private static String DEFAULT_LAST_EX = "Berkowitz";
    private static double DEFAULT_SALARY_EX = 1500.00;
    Employee employee = new Employee(DEFAULT_FIRST_EX, DEFAULT_LAST_EX, DEFAULT_SALARY_EX);

    @BeforeAll
    public static void beforeClass() {System.out.println("\nBeginning Employee tests");}

    @AfterAll
    public static void afterClass() {System.out.println("\nAfter Employee tests");}

    @Test
    void testCase1(){
        assertEquals(DEFAULT_FIRST_EX, employee.getFirstName());
        System.out.printf("Test Case 1\n Name %s, %s Salary %.2f",employee.getFirstName(),employee.getLastName(), employee.getMonthlySalary());
    }

    @Test
    void testCase2(){
        assertEquals(DEFAULT_LAST_EX, employee.getLastName());
        System.out.printf("\nTest Case 2\n Name %s, %s Salary %.2f",employee.getFirstName(),employee.getLastName(), employee.getMonthlySalary());
    }

    @Test
    void testCase3(){
        assertEquals(DEFAULT_SALARY_EX, employee.getMonthlySalary());
        System.out.printf("\nTest Case 3\n Name %s, %s Salary %.2f",employee.getFirstName(),employee.getLastName(), employee.getMonthlySalary());
    }

    @Test
    void testCase4(){
        employee.giveRaise(0.1);
        assertEquals(DEFAULT_SALARY_EX*(1+0.1), employee.getMonthlySalary());
        System.out.printf("\nTest Case 4\n Name %s, %s Salary %.2f",employee.getFirstName(),employee.getLastName(), employee.getMonthlySalary());
    }

    @Test
    void testCase5(){
        employee.giveRaise(5.0);
        assertEquals(DEFAULT_SALARY_EX*(1+5.0), employee.getMonthlySalary());
        System.out.printf("Test Case 5\n Name %s, %s Salary %.2f",employee.getFirstName(),employee.getLastName(), employee.getMonthlySalary());
    }

}
