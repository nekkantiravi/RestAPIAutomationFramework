package restassuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
    public static String getId() {
        String generatedString = RandomStringUtils.randomNumeric(5);
        return ("10" + generatedString);
    }

    public static String getfirstName() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return ("John" + generatedString);
    }

    public static String getlastName() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return ("Deer" + generatedString);
    }

    public static String getemail() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return ("David@gmail.com" + generatedString);
    }
}
