class Solution {
    public boolean isAnagram(String s, String t) {
        //we are going to utlize ascii values starting from lower 'a'
        // Create an array, that will contain 26 values of 0, they will represent the alphabet
        int[] alpha = new int[26];
        if(s.length() != t.length()) {
            return false;
        }
        //enter a for-loop and then increment each element for a corresponding char decrement aswell
        for(int i = 0; i < s.length(); i++){
            alpha[s.charAt(i) - 'a']++;
            alpha[t.charAt(i) - 'a']--;
        }

        for(int x : alpha) {
            if(x != 0) {
                return false;
            }
        }
        
        return true;
    }
}
