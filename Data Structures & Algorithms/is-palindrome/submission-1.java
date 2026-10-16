class Solution {
    public boolean isPalindrome(String s) {
        char[] input = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();

        int i = 0;
        int j = input.length - 1;

        while (i < j) {

            if (input[i] != input[j]) {
                return false;
            }

            i++;
            j--;
        }

        return true;

    }
}
