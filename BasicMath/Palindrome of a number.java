class Solution {
    public boolean isPalindrome(int n) {
        
        int original = n;   // Keep the original number
        int rev = 0;        // To store the reversed number
        
        while (n > 0) {
            int digit = n % 10;       // Get last digit
            rev = rev * 10 + digit;   // Append digit to reversed number
            n = n / 10;               // Remove last digit
        }
        
        // If reversed number equals original, it is a palindrome
        return rev == original;
    }
}
