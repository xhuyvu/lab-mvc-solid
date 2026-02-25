
package utils;

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

    public static String getString(String input) throws Exception {
        if (input.isEmpty()) {
            throw new Exception("Input must not be empty.");
        }
        return input;
    }
}
