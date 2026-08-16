class Solution {

    public String encode(List<String> strs) {
        //String needs to be encoded into a string
        //We need to convert the entire list of strings into one String
        // Iterate over the entire List
        //We need a place to store our String
        String enString;
        StringBuilder sb = new StringBuilder();
        int charCount;


        for(String string : strs) {
           charCount = string.length();             //Get the length of string
           sb.append(charCount + "#" + string);     //Add the length of the string to the decoded string
           }
        //Return the encoded string
        return enString = sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // 1) read the length (could be multiple digits)
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));

            // 2) read the next len characters as the string
            j++; // skip '#'
            res.add(str.substring(j, j + len));

            // 3) move pointer forward
            i = j + len;
        }

        return res;
    }
}
