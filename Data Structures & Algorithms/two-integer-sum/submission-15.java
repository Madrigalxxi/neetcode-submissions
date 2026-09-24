class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Create a hashmap
        HashMap<Integer,Integer> map = new HashMap<>();

        //Will be the curr value of the number subtracting the target
        int currVal = 0;
        //We be the val of the currVal - target used to find it in the map
        int diff = 0;


        //Iterate over the nums array
        for(int i = 0; i < nums.length; i++) {
            currVal = nums[i];
            diff = target - currVal;

            //if the map contains the diff as a key then we should have our two sum
            if(map.containsKey(diff)) {
                //return the index of the diff(found first) and the currIndex
                return new int[]{map.get(diff),i};
            } else {
                map.put(currVal,i);
            }
        }
        return null;
    }

}
