class Solution {
    public int maxDifference(String s) {
        char ch[] = s.toCharArray();
        HashMap<Character,Integer> map =  new HashMap<>();
        int evensmallest = s.length();
        int oddlargest = 1;
        for(int i = 0;i<ch.length;i++)
        {
            if(map.containsKey(ch[i]))
            {
                map.put(ch[i],map.get(ch[i])+1);
                
            }
            else
            {
                map.put(ch[i],1);
            }
        }
        for(Character i : map.keySet())
        {

            if(map.get(i)%2==0 && map.get(i)<evensmallest)
                evensmallest = map.get(i);
            else if(map.get(i)%2!=0 && map.get(i)>oddlargest)
                oddlargest = map.get(i);
        }
        return oddlargest-evensmallest;
    }
}
