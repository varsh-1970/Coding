import java.util.*;

public class Solution {
    public static List<Integer> printDivisors(int n) {
        
        List<Integer> divisors = new ArrayList<>();       //  To store divisors
        List<Integer> largeDivisors = new ArrayList<>();  //  To store divisors > ?n

        //  Loop from 1 to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {  //  i divides n
                divisors.add(i);   // add smaller divisor
                
                if (i != n / i) {  //  Avoid adding square root twice
                    largeDivisors.add(n / i);  // add larger divisor
                }
            }
        }
        
        //  Add the larger divisors in reverse order to maintain ascending order
        Collections.reverse(largeDivisors);
        divisors.addAll(largeDivisors);
        
        return divisors;
    }
}
