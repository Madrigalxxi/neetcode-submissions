class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Create a hashmap
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        //Fill the Hashmap with the elements and their frequencies
        for(int e : nums) {
            freqMap.put(e, freqMap.getOrDefault(e, 0) + 1);
        }

        //Fill the buckets with their values
        //Create the array made of List<Integer> 
        List<Integer>[] buckets = new List[nums.length + 1];
        //Fill the buckets with the corresponding values
        freqMap.forEach((num,freq) -> {
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        });

        List<Integer> result = new ArrayList<>();

        for(int i = buckets.length - 1; i > 0 && result.size() < k; i--) {
            if(buckets[i] != null) {
                result.addAll(buckets[i]);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
        
    }
}
