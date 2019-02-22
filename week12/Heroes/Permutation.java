package week12.Heroes;

public class Permutation {
    public static void main(String[] args) {
        String wort = "t";
        char[] warray = wort.toCharArray();
        System.out.println(isPalindrome(wort));
    }

    private static boolean isPalindrome(String s) {
        int length = s.length();

        if (length < 2) // If the string only has 1 char or is empty
            return true;
        else {
            // Check opposite ends of the string for equality
            if (s.charAt(0) != s.charAt(length - 1))
                return false;
                // Function call for string with the two ends snipped off
            else
                return isPalindrome(s.substring(1, length - 1));
        }
    }


}
