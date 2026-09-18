class Solution {
    public boolean hasDuplicate(int[] nums) {
		//If the array is empty than there are no duplicates
        if(nums.length <= 1) {
			return false;
		}

		//We are going to utilize a hashset. If there is a duplicate it will not be added to the hashset
		HashSet<Integer> set = new HashSet<>();

		//Iterate over the array
		for(int i = 0; i < nums.length; i++) {
			//If we can not add integer to the set then that means we have found a duplicate
			if(!set.add(nums[i])){
				return true;
			}
		}
		return false;
    }
}