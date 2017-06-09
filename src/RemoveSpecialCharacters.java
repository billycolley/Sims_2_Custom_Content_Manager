/**
 * This class removes special characters from a string.
 */
public class RemoveSpecialCharacters {
    /**
     * Removes special characters from a string and returns the altered string.
     */
    public static String remove(String name) {
        System.out.println("Removing Special Characters");
        System.out.println(name);
        String noSpecials = name.replaceAll("[^a-zA-Z0-9-_]+", "");
        return noSpecials;
    }

}
