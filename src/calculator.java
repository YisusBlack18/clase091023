public class calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) { 
        return a * b; 
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by 0!");
        }
        return a / b;
    }

}
