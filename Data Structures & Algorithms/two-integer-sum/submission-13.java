class Solution {
    public int[] twoSum(int[] nums, int target) {
        //We need to create a hashset that tracks the differnce and the positon.
		//When we iterate through the array we are going to have the current sum
		//The current sum will be subtracted from the target resulting in the difference
		// if the difference exists in the set as a key then the value of that key is the index of
		// the second sum

		//Stores the Difference,Indexx
		HashMap<Integer,Integer> map = new HashMap<>();

		int currNum = 0;
		int difference = 0;

		for(int i = 0; i < nums.length; i++) {
			//Logic: 
			currNum = nums[i];
			difference = target - currNum;

			//Check if the value exists in the HashSet
			if(map.containsKey(difference)) {
				return new int[]{map.get(difference),i};
			}


			//push tthe new pair into the hashSet
			map.put(currNum,i);

		}

		return null;

    }
}
