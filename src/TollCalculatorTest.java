import java.time.LocalDateTime;
import org.junit.Assert;
import org.junit.Test;

public class TollCalculatorTest {
    public static void main(String[] args) throws Exception {

    }

    @Test
    public void testhour() {
        TollCalculator tc = new TollCalculator();
        Vehicle car = new Car();
        
        LocalDateTime[] hour8 = {
                LocalDateTime.of(2021, 12, 8, 8, 10, 0),
        };

        LocalDateTime[] hour16 = {
                LocalDateTime.of(2021, 12, 8, 16, 10, 0),
        };

        int t8 = tc.getTollFee(car, hour8);
        int t16 = tc.getTollFee(car, hour16);

        // Actual
        int[] actual = { t8, t16 };

        // Expected
        int[] expected = { 18, 18 };

        // Assert
        Assert.assertArrayEquals(actual, expected);
    }
}
