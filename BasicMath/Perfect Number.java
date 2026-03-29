class Solution {
    static boolean isPerfect(int n) {
        
        if (n == 1) return false; // 1 is not perfect
        
        int sum = 1;  // 1 is always a factor
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;             // add the smaller divisor
                if (i != n / i) {     // add the paired divisor if different
                    sum += n / i;
                }
            }
        }
        
        // Check if sum of divisors equals the number
        return sum == n;
    }
}
