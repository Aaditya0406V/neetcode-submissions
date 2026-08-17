class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char str1 : s.toCharArray())
        {
            if(map1.containsKey(str1))
            {
                map1.put(str1,map1.get(str1)+1);
            }
            else{
                map1.put(str1,1);
            }
        }
        for(char str2 : t.toCharArray())
        {
            if(map2.containsKey(str2))
            {
                map2.put(str2,map2.get(str2)+1);
            }
            else{
                map2.put(str2,1);
            }
        }
       return map1.equals(map2);
    }
}
