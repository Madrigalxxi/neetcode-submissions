class Solution {
    public boolean isAnagram(String s, String t) {
        //First check the size of both strings
        // If they are not the same char len then we know they are not anagrams
        if(s.length() != t.length()) {
            return false;
        }

        // Create a hashmap that stores both the char and the count of both strings
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();

        // loop through both strings
        int lenOfAnagrams = s.length();

        char sChar;
        char tChar;
        int sCount;
        int tCount;

        for(int i = 0; i < lenOfAnagrams; i++) {
            sChar = s.charAt(i);
            tChar = t.charAt(i);

            if(!sMap.containsKey(sChar)){
                sMap.put(sChar, 1);
            } else {
                sCount = sMap.get(sChar);
                sCount++;
                sMap.put(sChar,sCount);
            }

            if(!tMap.containsKey(tChar)){
                tMap.put(tChar, 1);
            } else {
                tCount = tMap.get(tChar);
                tCount++;
                tMap.put(tChar,tCount);
            }
        }


        if(tMap.equals(sMap)) {
            return true;
        }
         return false;
 


        
    }
}
