class Solution {
    public boolean check(int[] nums) {
        int count = 0; // Initialize a counter to track the number of out-of-order pairs

        // Iterate through the array 'nums'
        for (int i = 0; i < nums.length; i++) {
            // Compare current element nums[i] with the next element nums[(i+1)%nums.length]
            // The use of modulus (%) ensures that nums[(i+1)%nums.length] wraps around to the start of the array if i+1 exceeds the array length
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++; // Increment count if the current element is greater than the next (indicating an out-of-order pair)
            }

            // Early exit condition:
            // If at any point the count exceeds 1, it means there are more than one pair of elements out of order,
            // which means it's not possible to make the array almost sorted with just one swap
            if (count > 1) {
                return false; // Return false immediately indicating the array cannot be almost sorted with at most one swap
            }
        }

        return true; // If we finish the loop with count <= 1, return true indicating the array can be almost sorted with at most one swap
    }
}
