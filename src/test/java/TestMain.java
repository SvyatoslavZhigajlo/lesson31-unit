import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    @Test
    public void testBy3OrNot3(){
        Main main = new Main();
        assertEquals(6,main.sumNumber(123));
        assertTrue(main.checkMultiplicity(9));
        assertFalse(main.checkMultiplicity(13));
    }

    @Test
    public void testConverterTime(){
        ConversionHoursMinutesSeconds conversionHoursMinutesSeconds = new ConversionHoursMinutesSeconds();
        assertEquals("00 hour and 06 minute and 00 second",
                conversionHoursMinutesSeconds.makeReadable(360));
        assertEquals("00 hour and 06 minute and 00 second",
                conversionHoursMinutesSeconds.makeReadable(3600));
    }
}
