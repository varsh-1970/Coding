class Solution {
    public static int gcd(int a, int b) {
        
        // Base case: if b is 0, GCD is a
        if (b == 0)
            return a;
        
        // Recursive case: GCD(b, a % b)
        return gcd(b, a % b);
    }
}
