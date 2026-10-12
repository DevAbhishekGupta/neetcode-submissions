class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if ( strs == null || strs.length == 0) {
            return null;
        }

        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();

            Arrays.sort(chars);
            String key = String.valueOf(chars);

            if (map.containsKey(key)) {
                map.get(key).add(s);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }

        for (List<String> list : map.values()) {
            result.add(list);
        }
        
        return result;
    }
}
