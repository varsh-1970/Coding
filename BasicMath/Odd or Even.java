class Solution {
    static boolean isEven(int n) {
        
        // Creating Scanner object (NOT needed here since input is already given as parameter)
        Scanner sc = new Scanner(System.in);
        
        // Check if number is divisible by 2
        if (n % 2 == 0) {
            // If divisible by 2 → Even number
            System.out.println("Even");
        } else {
            // Otherwise → Odd number
            System.out.println("Odd");
        }
        
        // Close scanner (good practice, but unnecessary here)
        sc.close();
    }
}
