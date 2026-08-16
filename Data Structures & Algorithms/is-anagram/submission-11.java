class Solution {
    public boolean isAnagram(String s, String t) {

        // Create a new integers array so that we can store all the chars that appear
        int[] letters = new int[26];

        // can not be anagrams if the are different lengths
        if(s.length() != t.length()) {
            return false;
        }

        //Loop through both strings and fill the char array with the repeating chars
        for(int i = 0; i < s.length(); i++){
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        //If the values are off of zero then the strings are not anagrams
        for(int charVal : letters) {
            if(charVal != 0) {
                return false;
            }
        }
        
        return true;
    }
}
