class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int item : arr)
        {
            if(map.containsKey(item))
            {
                map.put(item,map.get(item)+1);
            }
            else
            map.put(item,1);
        }
        int largest = -1;
        for(Integer item : map.keySet())
        {
            if(map.get(item)==item)
            {
                if(largest>item)
                {
                    continue;
                }
                else if(item>=largest)
                {
                    largest = item;
                }
            }
        }
        return largest;
    }
}