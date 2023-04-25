import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestParameterized {

    private Calculator calculator;
    private final int num1;
    private final int num2;
    private final int expected;

    public TestParameterized(int num1, int num2, int expected) {
        this.num1 = num1;
        this.num2 = num2;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        int result = calculator.add(num1, num2);
        assertEquals(expected, result);
    }

    @Ignore
    @Test
    public void testSubtract() {
        int result = calculator.subtract(num1, num2);
        assertEquals(expected, result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {3, 3, 6},
                {4, 4, 8}
        });
    }
}