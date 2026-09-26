class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //create a hashmap to store the grouped anagrams
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        //iterate over the strs array
        for(String str : strs) {
            //Sort the string
            char[] splitStr = str.toCharArray();
            Arrays.sort(splitStr);
            String sortedStr = new String(splitStr);

            //Add the key along with a new ArrayList<>()
            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr,new ArrayList<>());
            }
            //Add the string to the arraylist according to its key
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
