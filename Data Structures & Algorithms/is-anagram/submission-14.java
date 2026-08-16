class Solution {
	public boolean isAnagram(String s, String t) {
		//Create a single array of ints
		//We can iterate through both strings in the same loop and then increment by 1 and decrement by 1
		
		//Create an array to hold all possible lower case characters
		int[] alphaChars = new int[26];

		//String length
		int strLength = s.length();	
		
		//If the strings lengths are not the same then not anagrams
		if(strLength != t.length()) {
			return false;
		}


		//Loop through both strings
		for(int i = 0; i < strLength; i++) {
			alphaChars[s.charAt(i) - 'a']++;
			alphaChars[t.charAt(i) - 'a']--;
		}

		for(int i:alphaChars) {
			if( i != 0) {
				return false;
			}
		}

		return true;
	}
}