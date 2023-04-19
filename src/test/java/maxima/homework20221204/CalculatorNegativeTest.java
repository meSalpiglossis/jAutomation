package maxima.homework20221204;

import maxima.homework20221116.Calculator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.InvalidParameterException;

public class CalculatorNegativeTest {

    Calculator calculator;

    @BeforeMethod
    public void setup() {
        calculator = new Calculator();
    }

    @Test(timeOut = 5000, expectedExceptions = InvalidParameterException.class)
    public void divideBy0Test() {
        calculator.div(1, 0);
    }


    @Test(timeOut = 5000, expectedExceptions = InvalidParameterException.class)
    public void sqrtNegativeNumberTest() {
        calculator.sqrt(-1);
    }

}
