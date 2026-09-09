class Solution {
    public boolean hasDuplicate(int[] nums) {
		//Utilize a HashSet because we know that values need to be unique
		//If the nums array has zero or one value then we know that there are no duplicates
		if(nums.length <= 1){
			return false;
		}

		//Create the hashset
		HashSet<Integer> set = new HashSet<>();

		//Iterate over the nums array
		for(int i : nums) {
			//Check if the value already exists in the hashset
			if(set.contains(i)) {
				return true;
			}

			//if the num does not exist in the array then add it
			set.add(i);
		}
		return false;
    }
}