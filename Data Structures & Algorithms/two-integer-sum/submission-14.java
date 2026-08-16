class Solution {
    public int[] twoSum(int[] nums, int target) {
        // currInt - Diff - target
		// target - currentInt = key
		// store [Key,currIntIndex] into the hashMap
		// If the next currInt is a key in the map then we know that we found our two sum value

		HashMap<Integer,Integer> map = new HashMap<>();
		int currInt = 0;
		int key = 0;
		
		for(int i = 0; i < nums.length; i++) {
			currInt = nums[i];
			key = target - currInt;

			if(map.containsKey(currInt)) {
				return new int[]{map.get(currInt),i};
			} else {
				map.put(key,i);
			}
		}
		return null;
	}
}
