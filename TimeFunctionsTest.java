import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.*;

public class TimeFunctionsTest {

    @Test
    public void testGetCurrentDateTime() {
        LocalDateTime result = TimeFunctions.getCurrentDateTime();
        assertNotNull(result, "Current date and time should not be null");
    }
    @Test
    public void testConvertToISO8061() {
        LocalDateTime date = LocalDateTime.of(2024, 12, 3, 14, 10, 31);
        String result = TimeFunctions.convertToISO8061(date);
        assertEquals("2024-12-03T14:10:31Z", result, "ISO format mismatch");
    }
    @Test
    public void testDaysBetweenDates() {
        LocalDate start = LocalDate.of(2024, 12, 1);
        LocalDate end = LocalDate.of(2024, 12, 6);
        long result = TimeFunctions.daysBetween(start, end);
        assertEquals(5, result, "Days between dates mismatch");
    }


}
