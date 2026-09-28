class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Create a HashMap
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        // Iterate over the strs array and add the strings to the strs HashMap
        for(String str : strs) {
            // Create the key
            char[] splitStr = str.toCharArray();
            // sort the Array
            Arrays.sort(splitStr);
            // Turn into a stringKey
            String key = new String(splitStr);

            //check if the map contains the key
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
                map.get(key).add(str);
            }

            return new ArrayList<>(map.values());

    }
}
