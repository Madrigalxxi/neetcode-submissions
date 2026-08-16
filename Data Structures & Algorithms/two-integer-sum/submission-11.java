class Solution {
    public int[] twoSum(int[] nums, int target) {
        //A. create a hashmap
        HashMap<Integer,Integer> dict = new HashMap<>();

        //B. Iterate through the array and fill our dictionary while checking if we already have the solution
        //b1. declare global variables
        int diff;
        int currVal;
        int targetVal = target;

        //Iterate over our nums array
        for(int i = 0; i < nums.length; i++) {
            
            // Calculate the difference
            currVal = nums[i];
            diff = target - currVal;

            //Check if this diff val exists as a key in the hashmap
            if(dict.containsKey(diff)) {
                return new int[]{dict.get(diff), i};
            }

            // diff value does not exist in the array so place it and go to next index in array
            dict.put(currVal, i);
        }
        return null;

        }
    


    }
