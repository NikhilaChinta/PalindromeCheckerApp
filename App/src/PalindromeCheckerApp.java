public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Hardcoded string
        String input = "madam";

        // Step 2: Assume it is palindrome
        boolean isPalindrome = true;

        // Step 3: Compare characters from both ends
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 4: Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}