class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //create a hashmap to fill with the elements that are frequent (num,freq)
        HashMap<Integer,Integer> map = new HashMap<>();

        //Add the nums into the hashmap
        for(Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Add the values into a bucket
        //Create a bucket
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        //Fill the buckets with values from map
        map.forEach((num, freq) -> {
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        });

        //Solutions
        ArrayList<Integer> solution = new ArrayList<>();

        for(int i = nums.length; i > 0 && k > solution.size(); i--) {
            if(buckets[i] != null) {
                solution.addAll(buckets[i]);
            }
        }
        return solution.stream().mapToInt(i -> i).toArray();
    }
}
