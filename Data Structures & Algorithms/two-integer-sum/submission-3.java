class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        int temp;

        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            if (numIndexMap.containsKey(temp)) {
                return new int[]{numIndexMap.get(temp), i};
            }
            else {
                numIndexMap.put(nums[i], i);
            }

        }

        return new int[]{-1};
    }
}
