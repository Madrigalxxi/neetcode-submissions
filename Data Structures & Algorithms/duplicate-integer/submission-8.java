class Solution {
    public boolean hasDuplicate(int[] nums) {

// No duplicates if the length of the array is <1
if (nums.length <= 1) {
	return false;
}

// Create the HashSet
HashSet<Integer> numSet = new HashSet<>();

//Add ints to the HashSet
for(int num: nums) {
	//We have duplicates
	if(!numSet.add(num)) {
		return true;
	}
}

return false;

}
}