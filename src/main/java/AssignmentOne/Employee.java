package AssignmentOne;

/**
 * A class that creates an Employee object with a name and monthly salary
 * <pre>
 *Create a class called Employee that includes three instance variables—a first name (type String), a last
 *name (type String) and a monthly salary (double). Provide a constructor that initializes the three
 *instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not
 *positive, do not set its value. Write a test application named EmployeeTest that demonstrates class
 *Employee’s capabilities. Create two Employee objects and display each employee’s yearly salary. Then
 *give each Employee a 10% raise and display each Employee’s yearly salary again.
 *</pre>
 *
 *  * @author 20168209
 * */
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    /**
     *
     * @param firstName - String, first name of employee
     * @param lastName - String, Last name of employee
     * @param monthlySalary - Double, monthlySalary of employee
     */
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    /**
     * get first name from employee
     *
     * @return Firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set first name of employee
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get last name of employee
     *
     * @return Lastname
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set last name of employee
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the monthlySalary
     *
     * @return MonthlySalary
     */
    public Double getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * set the monthly Salary
     * if the monthly salary is greater than 0 multiply it by 1.10 to give employee 10% Raise
     *
     * @param monthlySalary
     */
    public void setMonthlySalary(Double monthlySalary) {
        if(monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        } else {
            System.err.println("Must enter a positive salary!");
        }
    }

    /**
     * Get yearly salary
     * Multiply monthlysalary by 12
     *
     * @return getmonthlySalary * 12
     */
    public Double yearlySalary() {
        return getMonthlySalary() * 12;
    }

    public void employeeRaise(double raise) {
        if(raise > 0) {
            this.monthlySalary += this.monthlySalary * (raise/100);
        } else {
            System.out.println("Raise must be a positive number!!!!");
        }
    }
}
