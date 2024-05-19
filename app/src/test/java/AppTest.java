import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    static final App app = new App();

    @Test 
    public void testPositiveValues() {
        Assert.assertEquals(app.calculateNumbers(2, 5, 1, 1), 3.5);
    }

    @Test
    public void testNegativeValues() {
        Assert.assertEquals(app.calculateNumbers(-1, -1, -1, -1), 1.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAllZeroValues() {
        app.calculateNumbers(0, 0, 0, 0);
    }

    @Test
    public void testZeroNumerator() {
        Assert.assertEquals(app.calculateNumbers(0, 0, 1, 1), 0.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testZeroDenominator() {
        app.calculateNumbers(1, 1, 0, 0);
    }

    @Test
    public void testDecimalValues() {
        Assert.assertEquals(app.calculateNumbers(2.5, 3.0, 0.5, 1.5), 2.75);
    }

    @Test
    public void testWholeAndDecimalValues() {
        Assert.assertEquals(app.calculateNumbers(5, 5.5, 5.5, 5), 1.0);
    }

    @Test
    public void testLargePositiveValues() {
        Assert.assertEquals(app.calculateNumbers(1000000000, 1000000000, 1000000000, 1000000000), 1.0);
    }

    @Test
    public void testLargeNegativeValues() {
        Assert.assertEquals(app.calculateNumbers(-99999999, -99999999, -99999999, -99999999), 1.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNotNumberValues() {
        app.calculateNumbers(Double.NaN, Double.NaN, Double.NaN, Double.NaN);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNotNumberAndRealNumberValues() {
        app.calculateNumbers(Double.NaN, 1, 1, 1);
    }

}
