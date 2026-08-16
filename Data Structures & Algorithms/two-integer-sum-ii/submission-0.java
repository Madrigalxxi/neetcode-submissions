class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Numbers are sorted in an non-decreasing order
        // [1,1,2,3,4,5] target = 8 
        // sum = leftPtr + rightPtr;
        // if(sum > target){leftPtr++;}else{rightPtr--;}

        //Create the left and right pointers
        int leftPtr = 0;
        int rightPtr = numbers.length - 1;
        int sum = 0;

        //As long the ptrs do not point to the same element in the array, execute
        while(leftPtr != rightPtr) {
            // Get sum
            sum = numbers[leftPtr] + numbers[rightPtr];
            
            //Return the solution
            if(sum == target) {
                return new int[]{leftPtr + 1, rightPtr + 1};
            }

            //Move the pointers
            if(sum < target) {
                leftPtr++;
            } else {
                rightPtr--;
            }
        }
        return new int[]{};
    }
}
