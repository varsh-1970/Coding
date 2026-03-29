class Solution {
    public int reverseDigits(int n) {
        
        int rev = 0; // To store the reversed number
        
        while (n > 0) {
            
            int digit = n % 10;  // Get the last digit of n
            
            rev = rev * 10 + digit; // Append digit to rev
            
            n = n / 10;           // Remove last digit from n
        }
        
        return rev;              // Return the reversed number
    }
}
