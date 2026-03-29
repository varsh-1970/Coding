class Solution {
    static boolean armstrongNumber(int n) {
        
        int original = n;   // Keep original number
        int sum = 0;        // Sum of cubes of digits
        
        // Extract each digit and compute cube sum
        while (n > 0) {
            int digit = n % 10;          // last digit
            sum += digit * digit * digit; // cube and add to sum
            n = n / 10;                  // remove last digit
        }
        
        // Check if sum of cubes equals original number
        return sum == original;
    }
}
