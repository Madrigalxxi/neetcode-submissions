class Solution {
    public int[] twoSum(int[] nums, int target) {
        //create a HashMap
        //Integer [value,index] value can be found as the difference
        HashMap<Integer,Integer> map = new HashMap<>();

        //Variables to think about
        int diff;
        //int currentIndex;
        int currVal;


        // after creating a hashmap we need to iterate over the nums array
        for(int i = 0; i < nums.length; i++){
            currVal = nums[i];
            diff = target - currVal;

            if(map.containsKey(diff)) {
                return new int[]{map.get(diff),i};
            }

            map.put(currVal,i);
        }
        
        return null;
    }
}
