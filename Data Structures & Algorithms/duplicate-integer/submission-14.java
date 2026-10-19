class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Create a hashset since sets can only contain a "one of"
        //Create a hashset <numbers>
        HashSet<Integer> set = new HashSet<>();

        //After creating a hashset check that we have atleast 2 values inside of the Array
        if(nums.length <= 1) {
            return false;
        }

        //iterate over the array and add the values into the Set
        for(int num : nums) {
            if(!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}