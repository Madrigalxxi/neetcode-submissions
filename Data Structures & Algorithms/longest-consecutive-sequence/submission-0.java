class Solution {
    public int longestConsecutive(int[] nums) {
        // Number is either a part of the sequence || Number is the beginning of the sequence
        // 1) Add every element from nums into a Hashset<Integer> 
        // 2) iterate through the nums and check if each element is either start_sequence or in_sequence (!set.contains(nums[i] - 1))
        // a) in_sequence -> Skip element
        // b) start_sequence -> begin counting the number of element in the sequence
        // 3) longest_seq -> int var that tracks the last longest sequence (at the end of a sequene count we set this to Integer.max(curr_seq.longest_seq);)
        // 4) longest_seq will be the solution returned to the user

        // The nums array is empty so no sequence can exist
        if(nums.length == 0) {
            return 0;
        }
        
        // Set we will contain all the elements from nums
        HashSet<Integer> numSet = new HashSet<>();

        // Add all elements from num into numSet
        for(int e : nums) {
            numSet.add(e);
        }

        int longestSeq = 0;

        // Iterate through each element in nums
        for(int i = 0; i < nums.length; i++) {
            int currSeq = 0;

            if(!numSet.contains(nums[i] - 1)) {
                currSeq++;
                // keep moving up the sequence untill next num is not in the set
                while(numSet.contains(nums[i] + currSeq)) {
                    currSeq++;
                }
                longestSeq = Integer.max(currSeq,longestSeq);
            }
        }
        return longestSeq;
    }
}
