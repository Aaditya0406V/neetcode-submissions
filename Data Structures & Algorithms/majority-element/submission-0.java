class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int item : nums) {
            if (map.containsKey(item)) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        for (int item : map.keySet()) {
            if (map.get(item) > nums.length / 2) {
                return item;
            }
        }

        return -1;
    }
}