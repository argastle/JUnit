import org.junit.*;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestXWatcher {
    Calculator calculator;
    @Rule
    public TestWatcher watcher = new TestWatcher() {
        @Override
        protected void starting(Description description) {
            System.out.println("Starting test: " + description.getMethodName());
        }

        @Override
        protected void succeeded(Description description) {
            System.out.println("Test succeeded: " + description.getMethodName());
        }

        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println("Test failed: " + description.getMethodName());
        }

        @Override
        protected void skipped(org.junit.AssumptionViolatedException e, Description description) {
            System.out.println("Test skipped: " + description.getMethodName());
        }

        @Override
        protected void finished(Description description) {
            System.out.println("Test finished: " + description.getMethodName());
        }
    };

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result);
    }
}
