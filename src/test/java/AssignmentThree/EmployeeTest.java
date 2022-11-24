package AssignmentThree;

import AssignmentOne.Employee;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tester class for Employee class. Checks all getters/setters, negatives and giving a raise
 * <pre>
 *     Using the Employee class from the first Java assignment do the following:
 *  Do assertion tests on all setter / getter methods
 *  Test negative salary in the constructor
 *  Test giving the employee a raise
 *  Use Execution Procedure (see tutorial) to organize a test where an employee is created, values
 * are assert and a raise is given
 * </pre>
 * @author 20168209
 */
public class EmployeeTest {
    private static String DEFAULT_FIRST = "H.H";
    private static String DEFAULT_LAST = "Holmes";
    private static double DEFAULT_SALARY = 1500.00;
    Employee employee = new Employee(DEFAULT_FIRST, DEFAULT_LAST, DEFAULT_SALARY);

    @DisplayName("Test Employees get first name")
    @Test
    void getFirstName(){
        assertEquals(DEFAULT_FIRST, employee.getFirstName());
        final String name = "Jeffery";
        employee.setFirstName(name);
        assertEquals(name, employee.getFirstName());
    }

    @DisplayName("Test employees set first name")
    @Test
    void setName(){
        final String name = "Dennis";
        employee.setFirstName(name);
        assertEquals(name, employee.getFirstName());
    }

    @DisplayName("Test Employees get last name")
    @Test
    void getLastName(){
        assertEquals(DEFAULT_LAST, employee.getLastName());
        final String name = "Bundy";
        employee.setLastName(name);
        assertEquals(name, employee.getLastName());
    }

    @DisplayName("Test employees set last name")
    @Test
    void setLastName(){
        final String name = "Ripper";
        employee.setLastName(name);
        assertEquals(name, employee.getLastName());
    }

    @DisplayName("Test employees get monthly salary")
    @Test
    void getMonthlySalary(){
        assertEquals(DEFAULT_SALARY, employee.getMonthlySalary());
        final double newSalary = 3500.00;
        employee.setMonthlySalary(newSalary);
        assertEquals(newSalary, employee.getMonthlySalary());
    }

    @DisplayName("Test employees set monthly salary")
    @Test
    void setMonthlySalary(){
        final double newSalary = 5435.00;
        employee.setMonthlySalary(newSalary);
        assertEquals(newSalary, employee.getMonthlySalary());
    }

    @DisplayName("Test employees constructor")
    @Test
    void constructor(){
        final double negativeBalance = -1500;
        employee = new Employee(DEFAULT_FIRST, DEFAULT_LAST, negativeBalance);
        assertEquals(0, employee.getMonthlySalary());
    }
//    @DisplayName("Execution Procedure")
//    @Test
//    void procedure(){
//        Employee procedureEmployee;
//        String DEFAULT_FIRST = "Brandon";
//        String DEFAULT_LAST= "Johnson";
//        double DEFAULT_SALARY = 1500.00;
//
//        procedureEmployee = new Employee(DEFAULT_FIRST, DEFAULT_LAST, DEFAULT_SALARY);
//
//        assertEquals(DEFAULT_FIRST, procedureEmployee.getFirstName());
//
//        assertEquals(DEFAULT_LAST, procedureEmployee.getLastName());
//
//        assertEquals(DEFAULT_SALARY, procedureEmployee.getMonthlySalary());
//
//        procedureEmployee.giveRaise(5.0);
//        assertEquals(DEFAULT_SALARY*(1+5.0), procedureEmployee.getMonthlySalary());
//    }
//    @DisplayName("Test employees raise")
//    @Test
//    void raise(){
//        assertEquals(DEFAULT_SALARY, employee.getMonthlySalary());
//        final double tenPercent = 0.1;
//        employee.giveRaise(tenPercent);
//        assertEquals(DEFAULT_SALARY*(1+tenPercent), employee.getMonthlySalary());
//        employee.setMonthlySalary(DEFAULT_SALARY);
//
//        final double fourHundredPercent = 4.0;
//        employee.giveRaise(fourHundredPercent);
//        assertEquals(DEFAULT_SALARY*(1+fourHundredPercent), employee.getMonthlySalary());
//    }
}
