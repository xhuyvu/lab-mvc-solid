package utils;

public final class Validation {

    //private constructor
    private Validation() {
    }

    // get int
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

    //get double
    public static double getDouble(String input) throws Exception {
        // check empty
        if (input.isEmpty()) {
            throw new Exception("Input must not be null.");
        }
        double data;
        try {
            data = Double.parseDouble(input);

        } catch (NumberFormatException nf) {
            throw new Exception("input must be Integer number");
        }
        // check if data less than 0
        if (data < 0) {
            throw new Exception("input greater than 0.");
        }
        return data;
    }

    //getString
    public static String getString(String input) throws Exception {
        // check empty
        if (input.isEmpty()) {
            throw new Exception("Input must not be empty.");
        }
        return input;
    }
}
