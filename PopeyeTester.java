import static org.junit.Assert.*;
import org.junit.Test;

public class PopeyeTester {
    public void testRegularMiles() {
        double nauticalMiles = 100;
        double expectedRegularMiles = 115.08;
        double actualRegularMiles = PopeyeSailing.convertNauticalToRegularMiles(nauticalMiles);
        assertEquals(expectedRegularMiles, actualRegularMiles, 0.01);
    }
    
    public void testTopSpeedTime() {
        double nauticalMiles = 100;
        double topSpeed = 10;
        double expectedTopSpeedTime = 10;
        double actualTopSpeedTime = PopeyeSailing.calculateTopSpeedTime(nauticalMiles, topSpeed);
        assertEquals(expectedTopSpeedTime, actualTopSpeedTime, 0.01);
    }
    
    public void testAverageSpeedTime() {
        double nauticalMiles = 100;
        double averageSpeed = 5;
        double expectedAverageSpeedTime = 20;
        double actualAverageSpeedTime = PopeyeSailing.calculateAverageSpeedTime(nauticalMiles, averageSpeed);
        assertEquals(expectedAverageSpeedTime, actualAverageSpeedTime, 0.01);
    }
}
