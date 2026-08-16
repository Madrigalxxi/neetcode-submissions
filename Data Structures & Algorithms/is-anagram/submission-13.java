class Solution {
    public boolean isAnagram(String s, String t) {
        // We are going to use one array to compare two strings
        // An array of the size[26]
        // we are going to increment the count of a character using this array ('Alpha' - 'a');
        // One string will be iterated that will increase the count
        // Another will iterate decreasing the count
        // If all 26 indexes are 0 then we have an anagram else, we do not

        int[] lowAlphaArray = new int[26];

        if(s.length() != t.length())
        return false;
        
        // Iterate through the two strings
        for(int i = 0; i < s.length(); i++) {
            lowAlphaArray[s.charAt(i) - 'a']++;
            lowAlphaArray[t.charAt(i) - 'a']--;
        }

        for(int nums : lowAlphaArray) {
            if(nums != 0) {
                return false;
            }
        }

        return true;

    }
}
