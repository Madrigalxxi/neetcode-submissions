class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          //create a hashmap that will be used to store all the string values
          HashMap<String,List<String>> groupedAnagrams = new HashMap<>();

          //Iterate over the strs array
          for(String str : strs) {
            //convert the string into a char because we need to have a way to create a key
            char[] strChar = str.toCharArray();
            //Sort the chararray to use as a key
            Arrays.sort(strChar);
            //Turn the char into a string so that the key can be used to point to our values in the List
            String strKey = String.valueOf(strChar);

            //if the map does not already contains the key then put the value down and then instantiate a List<> inside of the hashmap
            if(!groupedAnagrams.containsKey(strKey)){
                groupedAnagrams.put(strKey,new ArrayList<>());
            }
            //We need to add the strKey into the map
            groupedAnagrams.get(strKey).add(str);
            
          }
          
          return new ArrayList<>(groupedAnagrams.values());
    }
}
