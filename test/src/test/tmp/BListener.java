package test.tmp;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class BListener extends TestListenerAdapter {
  public void onTestSuccess(ITestResult tr) {
    System.out.println("Success");
    super.onTestSuccess(tr);
  }

  public void onTestFailure(ITestResult tr) {
    System.out.println("Failure");
    super.onTestFailure(tr);
  }

}
