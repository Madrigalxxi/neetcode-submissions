class Solution {
    public boolean hasDuplicate(int[] nums) {
        // A HashSet to store and check the values (i.e. If an item exists it will not be added)
        HashSet<Integer> numberSet = new HashSet<>();

        for(int num : nums) {
            //If the number can not be added to the list then we return true;
            if(!numberSet.add(num)) {
                return true;
            }
        }
        //else; the numbers in the array are unique 
        return false;
        
        }
}