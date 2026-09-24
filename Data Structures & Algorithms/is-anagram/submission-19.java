class Solution {
    public boolean isAnagram(String s, String t) {
        //are any of the strings less than 1? or unequal in size?
        if(s.length() != t.length() || t.length() == 0) {
            return false;
        }

        //Create lengthVar 
        int strLen = s.length();

        //Create an aray of size 26
        int[] alphaArray = new int[26];

        //iterate over the array 
        for(int i = 0; i < strLen; i++) {
            //Increment and Decrement the values in alphaArray
            alphaArray[s.charAt(i) - 'a']++;
            alphaArray[t.charAt(i) - 'a']--;
        }

        for(int i : alphaArray) {
            if(i != 0) {
                return false;
            }
        } 

        return true;

    }
}
