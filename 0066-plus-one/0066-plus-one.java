class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last element (least significant digit)
        for (int i = digits.length - 1; i >= 0; i--) {
            
            // If the digit is less than 9, just increment and return.
            // Example: [1, 2, 3] -> [1, 2, 4]
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit IS 9, it becomes 0.
            // We don't return yet because we need to carry the 1 to the next loop iteration.
            // Example: [1, 2, 9] -> changes 9 to 0, then loop moves to the '2'
            digits[i] = 0;
        }
        
        // If we reach here, it means ALL digits were 9.
        // Example: [9, 9, 9] -> became [0, 0, 0] inside the loop.
        // We need to return [1, 0, 0, 0].
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        
        return result;
    }
}