import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBeforeClassAndAfterClass {
    private static Calculator calculator;

    @BeforeClass
    public static void setUpClass() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDownClass() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.0);
    }
}
