class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int item : nums)
        {
            if(set.contains(item))
            {
                return item;
            }
            else
            {
                set.add(item);
            }
        }
        return -1;
    }
}
