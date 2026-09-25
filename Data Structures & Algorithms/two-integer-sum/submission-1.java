class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer matchIndex = numIndexMap.get(target - nums[i]);

            if (matchIndex != null ) {
                return new int[]{matchIndex, i};
            }
                numIndexMap.put(nums[i], i);

        }

        return new int[]{};
    }
}
