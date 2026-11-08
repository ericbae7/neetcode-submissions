class Solution {
    public boolean isAnagram(String s, String t) {
        // if the length is not the same then obiously false
        if(s.length() != t.length()){
            return false;
        }


        char[] temp1 = s.toCharArray();
        char[] temp2 = t.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);
        
        return Arrays.equals(temp1, temp2);

    }
}
