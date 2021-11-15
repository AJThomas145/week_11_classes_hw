import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addingNumbers(){
        assertEquals(5, calculator.addNumbers(2,3));
    }

    @Test
    public void subtractingNumbers(){
        assertEquals(7, calculator.subtractNumbers(9,2));
    }

    @Test
    public void multiplyingNumbers(){
        assertEquals(8, calculator.multiplyNumbers(2,4));
    }

    @Test
    public void dividingNumbers(){
        assertEquals(3.67, calculator.divideNumbers(97.31, 26.52), 0.01);
    }
}
