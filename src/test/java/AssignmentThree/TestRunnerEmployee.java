package AssignmentThree;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author 20168209
 */
public class TestRunnerEmployee {
    public static void main(String[] args) {
        Result resultEmployee = JUnitCore.runClasses(ExecutionProcedureEmployee.class);

        for (Failure failure : resultEmployee.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(resultEmployee.wasSuccessful());
    }
}
