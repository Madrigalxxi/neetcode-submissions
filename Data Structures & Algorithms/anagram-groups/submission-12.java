class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //sort the curr string value so i can get a key;
        // once sorted take key and andd it to the sublist that share key

        //Create a hashmap of String<List<Strings>> 
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        //Iterate over the entire strs Array
        for(String str : strs) {
            //Convert the str into a key
            char[] sortedChar = str.toCharArray();
            Arrays.sort(sortedChar);
            String key = new String(sortedChar);

            //Add the value into the Map
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());

    }
}
