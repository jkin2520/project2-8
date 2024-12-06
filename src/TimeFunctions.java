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
    /**
     * Converts a LocalDateTime to an ISO 8061 UTC time string.
     * @param dateTime The date and time to convert.
     * @return String in ISO 8061 UTC format.
     */
    public static String convertToISO8061(LocalDateTime dateTime) {
        return dateTime.atOffset(ZoneOffset.UTC) // Treats the dateTime as UTC
                       .format(DateTimeFormatter.ISO_INSTANT);
    }
    
    
    /**
     * Returns the number of days between two LocalDate objects.
     * @param startDate The start date.
     * @param endDate The end date.
     * @return Long representing days between dates.
     */
    public static long daysBetween(LocalDate startDate, LocalDate endDate) {
        return Duration.between(startDate.atStartOfDay(), endDate.atStartOfDay()).toDays();
    }


}
