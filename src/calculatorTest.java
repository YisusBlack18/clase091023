import static org.junit.Assert.assertEquals;

public class calculatorTest {
    @org.junit.Test
    public void testAdd() {
        calculator calc = new calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @org.junit.Test
    public void testSubstract() {
        calculator calc = new calculator();
        assertEquals(1, calc.substract(3, 2));
    }
}   