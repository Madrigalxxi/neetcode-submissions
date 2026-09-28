class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Create a hashMap<e,Frequency>
        HashMap<Integer,Integer> map = new HashMap<>();
        //Put the elements inside of the hashmap
        for(Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        //After make sure to create a list of buckets to store all the elements with a similar frequency
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        //Fill the buckets with the values in the HashMap
        map.forEach((num, freq) -> {
            if(buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        });

        //create the solution array that needs to be returned by the user
        ArrayList<Integer> solution = new ArrayList<>();

        //Get the values that are k frequent by iterating in reverse
        for(int i = nums.length; i > 0 && solution.size() < k; i--){
            if(buckets[i] != null) {
                solution.addAll(buckets[i]);
            }
        }

        return solution.stream().mapToInt(i -> i).toArray();




    }
}
