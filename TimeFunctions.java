import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 * Utility class for time-related functions.
 */
public class TimeFunctions {
    /**
     * Returns the current date and time.
     * @return LocalDateTime object of the current date and time.
     */
    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }
    
    public static String convertToISO8061(LocalDateTime dateTime) {
        return dateTime.atZone(ZoneId.systemDefault())
                       .withZoneSameInstant(ZoneOffset.UTC)
                       .format(DateTimeFormatter.ISO_INSTANT);
    }

}
