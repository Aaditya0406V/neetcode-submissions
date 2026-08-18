class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char ch[] = t.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while(start<end){
        
            if(ch[start]!=ch[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
