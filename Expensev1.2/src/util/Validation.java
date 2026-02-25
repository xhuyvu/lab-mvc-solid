
package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Locale;

/**
 *
 * @author xhuyvu
 */
public final class Validation {
    //private constructor
    private Validation() {
    }

    public static int getInt(String input) throws Exception {
        if (input.isEmpty()) {
            throw new Exception("Input must not be null.");
        }
        int data;
        try {
            data = Integer.parseInt(input);

        } catch (NumberFormatException nf) {
            throw new Exception("input must be Integer number");
        }
        if (data < 0) {
            throw new Exception("input greater than 0.");
        }
        return data;
    }

    public static boolean isDate(String date) {
        if (date.isEmpty()) {
            return false;
        }
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("dd-MMM-uuuu", Locale.ENGLISH)
                .withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            return false;
        }

        return true;
    }

    public static boolean isContent(String input) {
        if (input.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean isNumber(String input) {
        if (input.isEmpty()) {
            return false;
        }
        double data;
        try {
            data = Double.parseDouble(input);

        } catch (Exception ex) {
            return false;
        }
        if (data <= 0) {
            return false;
        }
        return true;

    }
}
