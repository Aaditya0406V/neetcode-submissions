class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        int length = arr[arr.length-1].length();
        return length;
    }
}