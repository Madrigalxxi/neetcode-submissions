class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //<Key= String of sorted chars,Value= List of grouped anagrams>
        HashMap<String,ArrayList<String>> groupedStrMap = new HashMap<>();

        //We need to iterate over the strings array
        for(String str : strs) {
            //Converting the str into a usable key
            //convert str into a char array
            char[] charString = str.toCharArray();
            //sort the char array
            Arrays.sort(charString);
            //Convert it into a string
            String keyStr = String.valueOf(charString);

            //If the key does not exist then add the key and instantiate the list
            if(!groupedStrMap.containsKey(keyStr)) {
                groupedStrMap.put(keyStr,new ArrayList<>());
            }
            //Add the string to the proper list
            groupedStrMap.get(keyStr).add(str);
        }

        return new ArrayList<>(groupedStrMap.values());

    }
}
