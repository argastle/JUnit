import org.junit.*;
import org.junit.rules.ExpectedException;

public class TestExpectedException {
    private Calculator calculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testDivideByZero() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Cannot divide by zero");
        calculator.divide(5, 0);
    }

    @After
    public void tearDown() {
        calculator = null;
    }
}

