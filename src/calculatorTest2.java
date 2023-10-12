import static org.junit.Assert.assertEquals;

public class calculatorTest2 {
    @org.junit.Test
    public void testMultiply() {
        calculator calc = new calculator();
        assertEquals(6, calc.multiply(2, 3));
    }

    @org.junit.Test
    public void testDivide() {
        calculator calc = new calculator();
        assertEquals(2, calc.divide(6, 3));
    }
    
}   