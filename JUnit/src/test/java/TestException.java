import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestException {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }
    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        int result = calculator.divide(6, 0);
    }
}
