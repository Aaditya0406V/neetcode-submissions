class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            // Swap characters
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            // Move pointers
            start++;
            end--;
        }
    }
}