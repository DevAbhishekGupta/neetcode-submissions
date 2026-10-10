class Solution {
    public boolean isAnagram(String s, String t) {
        
        int sLen = s.length();
        int tLen = t.length();

        if (sLen != tLen) {
            return false;
        }

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for (int i = 0; i < sLen; i++) {

            if (sChar[i] != tChar[i]) {
                return false;
            }
        }

        return true;
    }
}
