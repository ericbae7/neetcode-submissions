class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] word = s.toCharArray();
        char[] word2 = t.toCharArray();
        
        Arrays.sort(word);
        Arrays.sort(word2);

        return Arrays.equals(word,word2);
    }
}
