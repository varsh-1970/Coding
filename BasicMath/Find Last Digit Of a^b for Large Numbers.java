class Solution {
    static int getLastDigit(String a, String b) {
        
        // Case 1: If exponent b = "0"
        // Any number^0 = 1
        if (b.length() == 1 && b.equals("0"))
            return 1;
        
        // Case 2: If base a = "1"
        // 1 raised to anything is always 1
        if (a.equals("1"))
            return 1;
        
        // Compute b % 4 using Modulo function
        // Last digits repeat in cycles of 4
        // If remainder is 0, we take exponent as 4 (not 0)
        int exponent = (Modulo(4, b) == 0 ? 4 : Modulo(4, b));
        
        // Get last digit of 'a'
        // a.charAt(a.length()-1) gives last character
        // subtract '0' to convert char → int
        int lastDigit = a.charAt(a.length() - 1) - '0';
        
        // Compute (lastDigit ^ exponent)
        // Math.pow returns double, so cast to int
        int result = (int)(Math.pow(lastDigit, exponent));
        
        // Return only the last digit of result
        return result % 10;
    }
    
    
    // Function to compute (b % a) where b is a large number (string)
    private static int Modulo(int a, String b) {
        
        int res = 0; // stores intermediate remainder
        
        // Process each digit of b
        for (int i = 0; i < b.length(); i++) {
            
            // Convert character to digit using (char - '0')
            int digit = b.charAt(i) - '0';
            
            // Build number step-by-step and take modulo
            // Formula: (previous * 10 + current_digit) % a
            res = (res * 10 + digit) % a;
        }
        
        // 🔹 Final result = b % a
        return res;
    }
}
