class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while(s.length()>i && t.length()>j)
        {
            if(s.charAt(i)==t.charAt(j))
                i++;
            j++;
        }
        if(i==s.length())
            return true;
        else
            return false;
    }

}