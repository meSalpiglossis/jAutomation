package maxima.homework20221116;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.security.InvalidParameterException;

public class CalculatorTest {

    Calculator calculator;

    @BeforeMethod
    public void setup() {
        calculator = new Calculator();
    }

    @DataProvider(name = "Data For Add Test")
    public Object[][] dataForAddTest() {
        return new Object[][] {
            {10, 20, 30},
            {-10, 20, 10},
            {10, -20, -10},
            {-10,-20, -30}
        };
    }

    @Test(timeOut = 5000, dataProvider = "Data For Add Test")
    public void addTest(double a, double b, double result) {
        Assert.assertEquals(calculator.add(a, b), result);
    }

    @DataProvider(name = "Data For Subtract Test")
    public Object[][] dataForSubTest() {
        return new Object[][] {
            {10, 20, -10},
            {-10, 20, -30},
            {10, -20, 30},
            {-10,-20, 10}
        };
    }

    @Test(timeOut = 5000, dataProvider = "Data For Subtract Test")
    public void subTest(double a, double b, double result) {
        Assert.assertEquals(calculator.sub(a, b), result);
    }

    @DataProvider(name = "Data For Multiply Test")
    public Object[][] dataForMulTest() {
        return new Object[][] {
            {10, 20, 200},
            {-10, 20, -200},
            {10, -20, -200},
            {-10,-20, 200}
        };
    }

    @Test(timeOut = 5000, dataProvider = "Data For Multiply Test")
    public void mulTest(double a, double b, double result) {
        Assert.assertEquals(calculator.mul(a, b), result);
    }

    @DataProvider(name = "Data For Divide Test")
    public Object[][] dataForDivTest() {
        return new Object[][] {
            {10, 20, 0.5},
            {-10, 20, -0.5},
            {10, -20, -0.5},
            {-10,-20, 0.5}
        };
    }

    @Test(timeOut = 5000, dataProvider = "Data For Divide Test")
    public void divTest(double a, double b, double result) {
        Assert.assertEquals(calculator.div(a, b), result);
    }

    @DataProvider(name = "Data For Power Test")
    public Object[][] dataForPowTest() {
        return new Object[][] {
            {3, 2, 9},
            {4, 4, 256},
            {4, -1, 0.25},
            {-8, -2, 0.015625},
            {-8, 2, 64},
            {1000000000, 0, 1}
        };
    }

    @Test(timeOut = 5000, dataProvider = "Data For Power Test")
    public void powTest(double a, double b, double result) {
        Assert.assertEquals(calculator.pow(a, b), result);
    }

    @DataProvider(name = "Data For Square Root Test")
    public Object[][] dataForSqrtTest() {
        return new Object[][] {
            {4, 2},
            {0, 0},
            {0.25, 0.5},
        };
    }

    @Test(timeOut = 5000, dataProvider = "Data For Square Root Test")
    public void sqrtTest(double a, double result) {
        Assert.assertEquals(calculator.sqrt(a), result);
    }

    @Test(timeOut = 5000)
    public void memoryTest() {
        calculator.add(2, 2); //memory == 4
        calculator.sub(2); //memory == 2
        calculator.mul(4); //memory == 8
        calculator.div(4); //memory == 2
        calculator.pow(4); //memory == 16
        Assert.assertEquals(calculator.sqrt(),4);
    }

    @Test(timeOut = 5000, expectedExceptions = InvalidParameterException.class)
    public void sqrtNegativeNumberTest() {
        calculator.sqrt(-1);
    }

    @Test(timeOut = 5000, expectedExceptions = InvalidParameterException.class)
    public void divideBy0Test() {
        calculator.div(1, 0);
    }
}
