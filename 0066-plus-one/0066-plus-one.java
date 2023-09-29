class Solution {
    public int[] plusOne(int[] digits) {

// Iterate over the digits from right to left.       
        for (int i = digits.length - 1; i >= 0; i--) {
 // If the current digit is not 9, add 1 to it and return the array.
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
// Otherwise, set the current digit to 0 and continue iterating.
                digits[i] = 0;
            }
        }
 // If all digits are 9, create a new array with one more element than the original array,
        // set the first element to 1 and the rest to 0, and return the new array.
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

