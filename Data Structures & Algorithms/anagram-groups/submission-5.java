class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          //create a hashmap
          HashMap<String,List<String>> groupedAnagrams = new HashMap<>();

          //Iterate over the strs array
          for(String str : strs) {
            //convert the string into a char
            char[] strChar = str.toCharArray();
            //Sort the chararray to use as a key
            Arrays.sort(strChar);
            //Turn the char into a string
            String strKey = String.valueOf(strChar);
            //if the map does not already contains the key than add it to that list
            if(!groupedAnagrams.containsKey(strKey)){
                groupedAnagrams.put(strKey,new ArrayList<>());
            }

            groupedAnagrams.get(strKey).add(str);
            
          }
          
          return new ArrayList<>(groupedAnagrams.values());
    }
}
