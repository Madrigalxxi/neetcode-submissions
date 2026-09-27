class Solution {

    public String encode(List<String> strs) {
        //create a Stringbuilder to create the new string
        String enString;
        StringBuilder sb = new StringBuilder();
        int charCount;

        for(String str : strs) {
            charCount = str.length();
            sb.append(charCount + "#" + str);
        }
        
        return enString = sb.toString();
    }

    public List<String> decode(String str) {
        List<String> solution = new ArrayList<>();
        //Read the number
        int i = 0; 

        while(i < str.length()) {
            int j = i; 
            while(str.charAt(j)!= '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            // read the next len char as the string
            j++; //Skip '#'

            solution.add(str.substring(j,j + len));

            // move the pinter forward
            i = j + len;
        } 
        return solution;
    }
}
