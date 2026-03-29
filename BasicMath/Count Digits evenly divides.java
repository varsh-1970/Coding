class Solution {
    static int evenlyDivides(int n) {
        
        int count = 0;          // To store result
        int original = n;       // Keep original number (since n will change)
        
        while (n > 0) {
            
            int digit = n % 10;   // Get last digit
            
            // Ignore digit 0 (cannot divide by 0)
            if (digit != 0 && original % digit == 0) {
                count++;          // Valid divisor → increase count
            }
            
            n = n / 10;           // Remove last digit
        }
        
        return count;             // Return final count
    }
}
