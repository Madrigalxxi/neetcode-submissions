class Solution {
    public boolean isAnagram(String s, String t) {
		// We can use a single array that tracks the frequency of each lower char
		// If the string t and s array have the same values then the strings are Anagrams
		
		// No chars in either make them not anagrams since no chars will available.
		if( s.length() == 0 || t.length() == 0) {
			return false;
		}

		if(s.length() != t.length()) {
			return false;
		}

		//Create one array of size 26 stores all the char frequencies
		int[] alphaArray = new int[26];
		int strLen = s.length();

		//Enter for loop. At the end of the iterations the array should contain no values other than zero for 
		// the strings to be anagrams
		for(int i = 0; i < strLen; i++) {
			alphaArray[s.charAt(i) - 'a']++;
			alphaArray[t.charAt(i) - 'a']--;
		}

		for(int num : alphaArray) {
			if(num != 0) {
				return false;
			}
		}

		return true;

    }
}
