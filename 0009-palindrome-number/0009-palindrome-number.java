class Solution {
    public boolean isPalindrome(int x) {
        // A negative number is not a palindrome
        if (x < 0) {
            return false;
        }
        
        // Convert the number to a string
        String str = Integer.toString(x);
        
        // Call the recursive helper function
        return isPalindromeHelper(str, 0, str.length() - 1);
    }
    
    private boolean isPalindromeHelper(String str, int left, int right) {
        // Base case: if left index crosses right index, it's a palindrome
        if (left >= right) {
            return true;
        }
        
        // Check if characters at current indices are the same
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        
        // Recur for the next pair of characters
        return isPalindromeHelper(str, left + 1, right - 1);
    }
}
