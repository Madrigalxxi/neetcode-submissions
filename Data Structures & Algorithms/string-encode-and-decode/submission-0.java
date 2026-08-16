class Solution {

    public String encode(List<String> strs) {
        //Use stringBuilder to append everything togther (our encoded String)
        StringBuilder encodedString = new StringBuilder();
        String delim = "#";
        //Iterate over the List of strings
        //At each string we first append '#" to the beginning
        //Then get the char count of each string(append that number followed by the string)
        for(String str : strs) {
            encodedString.append(str.length()).append(delim).append(str);
        }
        return encodedString.toString();
    }


    public List<String> decode(String str) {
        //Create the List that will be returned
        List<String> solution = new ArrayList<>();

        //Iterate over the string using a while loop
        //create a pointer that lets us keep track of where the next delim is
        int i = 0;

        //While loop that will loop (str.length times)
        while(i < str.length()) {
            //j set to index i
            int j = i;
            //Increment pointer j untill we reach "#"
            while(str.charAt(j) != '#') {
                j++;
            }
            //set pointer i == the length of the string save as an int
            int length = Integer.parseInt(str.substring(i,j));
            //get the first char in the string
            i = j + 1;
            solution.add(str.substring(i, i + length));
            i += length;

        }
        
        return solution;
    }
}
