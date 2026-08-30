class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int item : nums)
        {
            set.add(item);
            item = 0;
        }
        int index = 0;
        for(Integer item : set)
        {
            nums[index] = item;
            index++;    
        } return set.size();
        }
}