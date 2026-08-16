class Solution {
    public boolean isAnagram(String s, String t) {
		//Create an integer array of size 26
		int[] charCount = new int[26];

		//check that both strings have the same length
		int sLen = s.length();
		int tLen = t.length();

		if(sLen != tLen) {
			return false;
		}


		//Iterate through both strings charAt(); 
		//Increment-Decrement each char value representation in the charCount array
		//If the charCount at any index is not 0 then not anagrams
		for(int i = 0; i < sLen; i++) {
			charCount[s.charAt(i) - 'a']++;
			charCount[t.charAt(i) - 'a']--;
		}

		for(int i: charCount) {
			if(i != 0) {
				return false;
			}
		}

		return true;


    }
}
