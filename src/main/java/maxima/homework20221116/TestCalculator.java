package src.main.java.maxima.homework20221116;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class TestCalculator{

    private final Calculator calculator = new Calculator();

    @Test
    void addTest() {
        assertEquals(2, calculator.add(1, 1));
        assertEquals(11, calculator.add(1, 10));
    }

    @Test
    void addMemoryTest() {
        assertEquals(1, calculator.add(1));
    }

    @Test
    void subTest() {
        assertEquals(0, calculator.sub(1, 1));
    }

    @Test
    void subMemoryTest() {
        assertEquals(-1, calculator.sub(1));
    }

    @Test
    void mulTest() {
        assertEquals(20, calculator.mul(4, 5));
    }

    @Test
    void mulMemoryTest() {
        assertEquals(0, calculator.mul(4));
    }

    @Test
    void divTest() {
        // TODO: Add reading input data for test from file
        assertEquals(2, calculator.div(10, 5));
    }

    @Test
    void divMemoryTest() {
        // TODO: Add reading input data for test from file
        assertEquals(0, calculator.div(10));
    }

    @Test
    void powTest() {
        // TODO: Add reading input data for test from file
        assertEquals(8, calculator.pow(2, 3));
    }

    @Test
    void powMemoryTest() {
        // TODO: Add reading input data for test from file
        assertEquals(0, calculator.pow(3));
    }

    @Test
    void sqrtTest() throws IOException {
        FileInputStream fis = new FileInputStream("src\\resources\\sqrtTestData.properties");
        Properties properties = new Properties();
        properties.load(fis);
        fis.close();

        assertEquals(Double.parseDouble((String) properties.get("sqrtTestData4Expected2")),
            calculator.sqrt(Double.parseDouble((String) properties.get("sqrtTestData4"))));
        assertEquals(Double.parseDouble((String) properties.get("sqrtTestData9Expected3")),
            calculator.sqrt(Double.parseDouble((String) properties.get("sqrtTestData9"))));
        assertEquals(Double.parseDouble((String) properties.get("sqrtTestData16Expected4")),
            calculator.sqrt(Double.parseDouble((String) properties.get("sqrtTestData16"))));
    }

    @Test
    void sqrtMemoryTest() {
        assertEquals(0, calculator.sqrt());
    }
}