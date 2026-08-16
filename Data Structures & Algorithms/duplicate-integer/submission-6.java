// We are making sure that values in the array are unique
// We should use a hashset. If placing a value in the 
class Solution {
    public boolean hasDuplicate(int[] nums) {
        // If the arrays size is < 1 then return false
        if(nums.length < 1) {
            return false;
        }

        // Create a hashset
        HashSet<Integer> set = new HashSet<Integer>();

        // Try placing all nums elements into the hashset
        for(int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                return true;
            }
        }

        // Iterated through all elements in nums
        return false;
    


    }
}
