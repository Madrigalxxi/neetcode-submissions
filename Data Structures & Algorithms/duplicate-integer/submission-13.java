class Solution {
    public boolean hasDuplicate(int[] nums) {
        //If the array is of size one or less than we know that there are no duplicates
        if(nums.length <= 1) {
            return false;
        }

        //Loop over the nums array and add each element into a hashmap.
        //if any element is rejected than that meas that we have a duplicate
        //create the hashmap
        HashSet<Integer> map = new HashSet<>();

        //Loop over the array
        for(int i = 0; i < nums.length; i++) {
            if(!map.add(nums[i])) {
                return true;
            }
        }

        //If we loop the entire array then duplicates do not exist
        return false;


    }
}