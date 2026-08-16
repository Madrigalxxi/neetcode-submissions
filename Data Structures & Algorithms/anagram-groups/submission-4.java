class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // Create a hashmap that will hold the key, that helps us sort the strings
        // into their anagram groupings.
        Map<String,List<String>> groupedAnagrams = new HashMap<>();

        //Iterate over the entire strs array
        for(String str: strs) {
            //Convert the str into a char array
            char[] strChar = str.toCharArray();
            // Sort the strChar
            Arrays.sort(strChar);
            //After sorted convert back to a string we can use that as the string
            String strKey = String.valueOf(strChar);
            // Add the string(key) into the hashmap with an empty list if the grouped
            if(!groupedAnagrams.containsKey(strKey)) {
                groupedAnagrams.put(strKey,new ArrayList<>());
            }

            groupedAnagrams.get(strKey).add(str);
            // anagrams does not exist else use this to find the location of the string
            // in the hashmap and add into .put(str) into the Hashmap
            // At the end we can return a list of the strings.
            
        }

        return new ArrayList<>(groupedAnagrams.values());
    }
}
