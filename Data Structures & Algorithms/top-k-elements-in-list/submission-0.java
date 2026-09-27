class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] list = new List[nums.length+1];

        for (int key : map.keySet()) {
            int frequency = map.get(key);

            if(list[frequency] == null) {
                list[frequency] = new ArrayList<>();
            }

            list[frequency].add(key);
        }

        int[] result = new int[k];
        int count = 0;

        for (int i = list.length -1; i >=0 && count < k; i--) {
            if(list[i] != null) {
                for (int j : list[i]) {
                    result[count++] = j;

                    if (count == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
