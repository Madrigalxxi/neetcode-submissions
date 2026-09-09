class Solution {
    public boolean isAnagram(String s, String t) {
		//We need to create one array of size N (n = the number of lowercase alphabets letters 26)
		int[] alphas = new int[26];

		if(t.length() != s.length()) {
			return false;
		}

		//Enter a for loop and increment ever letter in its corresponding place
		for(int i = 0; i < s.length(); i++) {
			alphas[s.charAt(i) - 'a']++;
			alphas[t.charAt(i) - 'a']--;
		}

		for(int i = 0; i < alphas.length; i++) {
			if(alphas[i] != 0) {
				return false;
			}
		}
		
		return true;
    }
}
