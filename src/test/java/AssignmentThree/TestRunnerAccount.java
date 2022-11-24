package AssignmentThree;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author 20168209
 */
public class TestRunnerAccount {
    public static void main(String[] args) {
        Result resultAccount = JUnitCore.runClasses(ExecutionProcedureAccounts.class);

        for (Failure failure : resultAccount.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println(resultAccount.wasSuccessful());
    }
}
