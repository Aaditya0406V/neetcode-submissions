class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        Integer freq[] = new Integer[map.size()];
        int freqindex = 0;
        for(Integer item : map.keySet())
        {
            freq[freqindex++] = map.get(item);
        }
        Arrays.sort(freq,Collections.reverseOrder());
        
        int count = 0;
        int index = 0;
        HashSet<Integer> set = new HashSet<>();
        for(Integer item : freq)
        {
            
            Integer key = null;
            for(Integer i : map.keySet())
            {
                if(count==k)
                    break;
                if(item.equals(map.get(i)))
                { 
                    if(set.add(i))
                        count++;
                    key = i;
                }
            }
            if(key!=null)
                map.remove(key);

            
        }
        int arr [] = new int [set.size()];
        for(Integer item : set)
            {arr[index++] = item;}
        return arr;
    }
}
