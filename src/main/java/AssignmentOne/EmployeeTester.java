package AssignmentOne;

/**
 * A Class to test the Employee class
 */
public class EmployeeTester {
    public static void main(String[] args) {
        System.out.println("Employee Tester Class!");

        //TEST 1: Create an employee and echo the details
        Employee employeeOne = new Employee("Brandon", "Johnson", 2500.00);
        Employee employeeTwo = new Employee("Darrell", "Johnson", 4000.00);

        //TEST 2: Set a negative setter to test if it sets a negative number
        employeeOne.setMonthlySalary(-2500.00);
        employeeTwo.setMonthlySalary(-500.00);
        printEmployeeInfo(employeeOne);
        printEmployeeInfo(employeeTwo);

        //TEST 3: Get yearly salary for each of the employees
        employeeOne.yearlySalary();
        employeeTwo.yearlySalary();
        System.out.printf("%s %s\n Salary: %.2f\n", employeeOne.getFirstName(), employeeOne.getLastName(), employeeOne.yearlySalary());
        System.out.printf("%s %s\n Salary: %.2f\n", employeeTwo.getFirstName(), employeeTwo.getLastName(), employeeTwo.yearlySalary());

        //TEST 4: Get yearly salary for employees after adding 10% Raise
        employeeOne.setMonthlySalary(2500.00);
        employeeTwo.setMonthlySalary(4000.00);
        employeeOne.yearlySalary();
        employeeTwo.yearlySalary();
        System.out.printf("%s %s\n Salary: %.2f\n", employeeOne.getFirstName(), employeeOne.getLastName(), employeeOne.yearlySalary());
        System.out.printf("%s %s\n Salary: %.2f\n", employeeTwo.getFirstName(), employeeTwo.getLastName(), employeeTwo.yearlySalary());
    }

    public static void printEmployeeInfo(Employee employee) {
        System.out.printf("%s %s\n Salary: %.2f\n", employee.getFirstName(), employee.getLastName(),employee.getMonthlySalary());

    }
}
