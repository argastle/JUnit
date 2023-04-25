public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int slowAdd(int num1, int num2) throws InterruptedException {
        Thread.sleep(200);
        return num1 + num2;
    }
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
}
