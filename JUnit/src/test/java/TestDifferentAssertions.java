import org.junit.*;

public class TestDifferentAssertions {
    private static Calculator calculator;

    @BeforeClass
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterClass
    public static void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        Assert.assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 2);
        Assert.assertTrue(result > 0);
        Assert.assertFalse(result < 0);
        Assert.assertNotEquals(0, result);
    }

    @Test
    public void testMultiply() {
        int result = calculator.multiply(2, 3);
        Assert.assertNotSame(5, result);
        Assert.assertSame(6, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(10, 2);
        Assert.assertEquals(5.0, result, 0.0);
    }

    @Test
    @Ignore
    public void testNull(){
        String i = null;
        Assert.assertNull(i);
        i = "o";
        Assert.assertNotNull(i);
    }
}
