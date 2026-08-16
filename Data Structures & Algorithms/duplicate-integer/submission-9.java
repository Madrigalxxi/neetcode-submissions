class Solution {
    public boolean hasDuplicate(int[] nums) {
		//Create a hshset if the value repeats when adding to the set then we wont add and return true
        HashSet<Integer> set = new HashSet<>();

		//Nums can be empty or size of 1
		if(nums.length <= 1) {
			return false;
		}

		for(int i: nums) {
			if(!set.add(i)) {
				return true;
			}
		}

		return false;

    }
}