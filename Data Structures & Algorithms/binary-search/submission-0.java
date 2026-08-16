class Solution {
    public int search(int[] nums, int target) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0;i<nums.length;i++)
        {
            set.add(nums[i]);
            if(set.contains(target))
            {
                return i;
            }
        }
        return -1;
    }
}
