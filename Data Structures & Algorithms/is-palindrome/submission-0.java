class Solution {
    public boolean isPalindrome(String s) {
       String currStr = s.toLowerCase().replaceAll("[^a-z-0-9]","");

       int start = 0;
       int end = currStr.length() - 1;

       while(start < end) {
        if(currStr.charAt(start) != currStr.charAt(end)) {
            return false;
        } 
        start++;
        end--;
       }
       return true;
    }
}
