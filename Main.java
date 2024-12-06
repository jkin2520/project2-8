import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Main class to demonstrate the usage of the TimeFunctions utility class.
 * This program:
 * - Retrieves the current date and time.
 * - Converts a LocalDateTime to an ISO 8061 UTC time string.
 * - Calculates the number of days between two dates.
 */
public class Main {

    /**
     * The entry point of the program.
     * Demonstrates the functionality of TimeFunctions.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = TimeFunctions.getCurrentDateTime();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Convert the current LocalDateTime to an ISO 8061 UTC time string
        String isoFormat = TimeFunctions.convertToISO8061(currentDateTime);
        System.out.println("ISO 8061 UTC Time: " + isoFormat);

        // Define two dates to calculate the days between them
        LocalDate startDate = LocalDate.of(2024, 12, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 6);

        // Calculate the number of days between the two dates
        long daysBetween = TimeFunctions.daysBetween(startDate, endDate);
        System.out.println("Days Between " + startDate + " and " + endDate + ": " + daysBetween);
    }
}
