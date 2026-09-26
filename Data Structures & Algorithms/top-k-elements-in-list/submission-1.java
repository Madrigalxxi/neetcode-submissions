class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //We need to get the k most frequent elements within the array
        // 1. Create a Hashmap(num,freq)
        // 2. put the values into buckets so we can iterate in reverse 
        // - get all the k most frequent elements.
        //Return array with those k values

        //1. Create and fill hashmap
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        //Fill the HashMap with values from array
        for(int e : nums) {
            freqMap.put(e,freqMap.getOrDefault(e, 0) + 1);
        }

        //Create the buckets
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        //Fill the buckets
        freqMap.forEach((num,freq) -> {
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        });
        //Create the return val
        List<Integer> solution = new ArrayList<>();
        //Iterate over the bucket array and fill the solution array
        for(int i = buckets.length - 1; i > 0 && solution.size() < k; i--) {
            if(buckets[i] != null) {
                solution.addAll(buckets[i]);
            }
        }

        return solution.stream().mapToInt(i -> i).toArray();
    }
}
