import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void add_two_ints() {
        assertEquals(8, calculator.add(4, 4).intValue());
    }

    @Test
    public void subtract_two_ints() {
        assertEquals(5, calculator.subtract(8, 3).intValue());
    }

    @Test
    public void multiply_two_ints() {
        assertEquals(9, calculator.multiply(3, 3).intValue());
    }

    @Test
    public void divide_two_ints() {
        assertEquals(3.0, calculator.divide( 6, 2), 0.01);
    }

    }



