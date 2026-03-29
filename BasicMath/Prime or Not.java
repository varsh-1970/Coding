class Solution {
    static boolean isPrime(int n) {
        
        // Numbers less than or equal to 1 are NOT prime
        if (n <= 1) return false;
        
        // Check divisibility from 2 to √n
        for (int i = 2; i * i <= n; i++) {
            
            // If i divides n, n is not prime
            if (n % i == 0) return false;
        }
        
        // No divisors found → n is prime
        return true;
    }
}
