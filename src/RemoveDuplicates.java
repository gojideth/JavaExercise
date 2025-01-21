import java.util.HashSet;

public class RemoveDuplicates {

    /**
     * Removes duplicate characters from the given string while maintaining the order.
     *
     * @param input The input string
     * @return A string without duplicate characters
     */
    public static String removeDuplicates(String input) {
        // Use a HashSet to track seen characters
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                result.append(c);  // Append only if it is not seen before
                seen.add(c);       // Mark the character as seen
            }
        }
        return result.toString();
    }
}
