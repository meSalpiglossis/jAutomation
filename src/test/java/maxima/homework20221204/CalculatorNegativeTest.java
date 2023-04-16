package maxima.homework20221204;

import maxima.homework20221116.Calculator;
import org.testng.annotations.Test;

import java.security.InvalidParameterException;

public class CalculatorNegativeTest {

    @Test(timeOut = 5000, expectedExceptions = InvalidParameterException.class)
    public void divideBy0Test() {
        Calculator calculator = new Calculator();
        calculator.div(1, 0);
    }


    @Test(timeOut = 5000, expectedExceptions = InvalidParameterException.class)
    public void sqrtNegativeNumberTest() {
        Calculator calculator = new Calculator();
        calculator.sqrt(-1);
    }

}
