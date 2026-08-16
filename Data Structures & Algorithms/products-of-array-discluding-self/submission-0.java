class Solution {
    public int[] productExceptSelf(int[] nums) {
        // If the array is empty then we know that we need to return an empty array
         if(nums.length == 0) {
            return new int[0];
         }

         // Two pass solution: Have an integer called Prefix (get the totol product of all prefixes)
         // create a second solution to store the totol product of all the elements in the array (Except self)
         int[] solution = new int[nums.length];
         int prefix = 1;

         // First pass of the array
         for(int i = 0; i < nums.length; i++) {
            // prefix needs to be updated
            // if this is the first loop then we dont need to update the prefix since there is no prefix
            if(i != 0) {
                prefix = prefix * nums[i - 1];
            }

            // First index is equal to the prefix 
            solution[i] = prefix;
         }

         int suffix = 1;

         //Second pass of the array
         for(int i = (nums.length - 1); i >= 0; i--) {

            //Update the suffix if it isnt the last index
            if( i != (nums.length - 1)) {
                suffix = suffix * nums[i + 1];
            }

            //Multiply the suffix by the current solution[index]
            solution[i] = solution[i] * suffix;
         }

         return solution;
    }
}  
