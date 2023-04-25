import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSlowAddition {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Ignore
    @Test(timeout = 220)
    public void testSlowAdd() throws InterruptedException {
        int result = calculator.slowAdd(1, 1);
        assertEquals(2, result);
    }

}