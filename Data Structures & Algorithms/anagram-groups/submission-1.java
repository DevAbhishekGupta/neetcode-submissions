class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if ( strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            
            int[] count = new int[26];
            for(char c: s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < 26; i++) {
                sb.append("#");
                sb.append(count[i]);
            }

            String key = sb.toString();

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
