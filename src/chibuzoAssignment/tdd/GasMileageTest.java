package chibuzoAssignment.tdd;

import chapter4.GasMileage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GasMileageTest {
    @Test
    public void testMilesDrivenPerGallon(){
        GasMileage toyota = new GasMileage();
        toyota.milesPerGallon(40, 20);
        assertEquals(2.0, toyota.checkMilesPerGallon());
    }
}
