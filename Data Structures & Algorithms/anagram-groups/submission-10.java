class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Create a hashmap
        HashMap<String,List<String>> map = new HashMap<>();
        //Fill the hashmap with the anagram
        for(String str : strs) {
            //Create a key
            char[] splitStr = str.toCharArray();
            Arrays.sort(splitStr);
            String key = new String(splitStr);

            //Put the str in the hashmap
            if(!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }
            //put the str in the map\
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
