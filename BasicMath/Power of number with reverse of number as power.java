class Solution {
    public int reverseExponentiation(int n) {
        
        // Step 1: Reverse the digits of n
        int rev = 0;
        int temp = n; // store original n
        
        while (temp > 0) {
            int digit = temp % 10;   // get last digit
            rev = rev * 10 + digit;  // build reversed number
            temp = temp / 10;         // remove last digit
        }
        
        // Step 2: Compute n ^ rev
        int result = (int)Math.pow(n, rev); // cast to int
        
        // Step 3: Return the result
        return result;
    }
}
