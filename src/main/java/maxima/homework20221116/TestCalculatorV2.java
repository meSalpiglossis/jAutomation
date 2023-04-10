package maxima.homework20221116;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static maxima.homework20221116.CalculatorV2.*;

@RunWith(Parameterized.class)
public class TestCalculatorV2 {

    private final double a;
    private final double b;
    private final double c;
    private final double result;

    public TestCalculatorV2(double a, double b, double c, double result) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {1, 1, 0, 2},
            {2, 2, 0, 4},
            {2, 3, 0, 5}
        };
        return Arrays.asList(data);
    }

    @Test
    public void addTest() {
        assertEquals(result, add(a, b));
    }


}
