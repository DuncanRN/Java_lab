//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void addNumbersTest(){
        assertEquals(9, calculator.addNumbers(5,4));
    }

    @Test
    public void subtractNumbersTest(){
        assertEquals(27, calculator.subtractNumbers(30,3));
    }

    @Test
    public void multiplyNumbersTest(){
        assertEquals(49, calculator.multiplyNumbers(7,7));
    }

    @Test
    public void divideNumbersTest(){
        assertEquals(11, calculator.divideNumbers(121,11),0);
    }


}
