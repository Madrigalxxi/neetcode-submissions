class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      //We need to sort the numbers so we know their corresponding frequency
      // we do this by creating a hashmap(num,freq)
      // create some buckets so that we can store of all the numbers with the same nmumber of occurences in the same bucket


      HashMap<Integer,Integer> map = new HashMap<>();

      //Iterate over nums and add the values with their frequencis to the hashmap
       for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
       }  

       //Create the bucket array
       ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        //Fill the bucket array
       map.forEach((num,freq) -> {
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
             buckets[freq].add(num);
       });

       ArrayList<Integer> solution = new ArrayList<>();

       //return the solution to the question
       //We need to start i at the most frequent bucket number from there find the k most frequent elements
       for(int i = nums.length; i > 0 && solution.size() < k; i--) {
            if(buckets[i] != null) {
                solution.addAll(buckets[i]);
            }
       }

       return solution.stream().mapToInt(i -> i).toArray();
    }
}
