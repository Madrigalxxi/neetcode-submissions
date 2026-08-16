class Solution {
    public boolean hasDuplicate(int[] nums) {
        // If any number appears more than once
		// HashSet so that we can not store duplicate values
		// if a value already exists then we have a duplicate!
		//	-	-	-
		// If size() of nums <= 1 then there are no duplicates
		if(nums.length <= 1) {
			return false;
		}

		// there are more than 1 nums in the array
		// create a hashset
		HashSet<Integer> set = new HashSet<>();

		// Add values from the array into the hashset
		// If the value is not added into the hashset then
		// we need to return false
		for( int i : nums) {
			if(set.add(i) == false) {
				return true;
			}
		}

		return false;

    }
}