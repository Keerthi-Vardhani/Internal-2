package Internal2.Internal2;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCalculator {
    private Caluclator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Caluclator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(calculator.add(2, 3), 5);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(5, 3), 2);
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(2, 3), 6);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(calculator.divide(6, 3), 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(6, 0);
    }
}
