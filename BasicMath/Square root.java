class Solution {
    int floorSqrt(int n) {
        
        if (n == 0 || n == 1) return n;  // Handle n = 0 or 1
        
        int start = 1, end = n;
        int ans = 0;  // To store floor value
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Use long to avoid overflow for mid*mid
            long square = (long)mid * mid;
            
            if (square == n) {
                return mid;  // perfect square
            } else if (square < n) {
                ans = mid;      // mid is a candidate
                start = mid + 1; // try higher
            } else {
                end = mid - 1;  // try lower
            }
        }
        
        return ans;  // floor value
    }
}
