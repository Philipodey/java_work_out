package chibuzoAssignment.tdd;

import chapter4.GasMileage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GasMileageTest {
    @Test
    public void testMilesDrivenPerGallon(){
        double expected = 10.0;git
        GasMileage toyota = new GasMileage();
        double actual = toyota.milesPerGallon(100, 10);
        assertEquals(expected, actual, 0.01);
    }
}
