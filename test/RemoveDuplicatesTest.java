public class RemoveDuplicatesTest {

    public static void main(String[] args) {
        assertTest("geeksforgeeks", "geksfor");
        assertTest("HappyNewYear", "HapyNewYr");
        assertTest("AABBCCD112233", "ABCD123");
        assertTest("abcdef", "abcdef");
        assertTest("aaaaaaa", "a");
        assertTest("AaBbCcAaBbCc", "AaBbCc");
        assertTest("", "");
        assertTest("!@#!@#!@$%$%", "!@#$%");

        System.out.println("All test cases passed! :)");
    }

    private static void assertTest(String input, String expectedOutput) {
        String result = RemoveDuplicates.removeDuplicates(input);

        if (!result.equals(expectedOutput)) {
            System.err.println("Test failed for input: \"" + input + "\"");
            System.err.println("Expected: \"" + expectedOutput + "\", but got: \"" + result + "\"");
            throw new AssertionError("Test case failed!");
        }
    }
}
