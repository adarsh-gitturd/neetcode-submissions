class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        Map<String, ArrayList<String>> map = new HashMap<>();
        String[] sortedStr = new String[len];

        for(int i = 0; i < len; i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            sortedStr[i] = new String(c);
        }

        for(int i = 0; i < len; i++){
            if(!map.containsKey(sortedStr[i])){
                map.put(sortedStr[i], new ArrayList<>());
            }

            map.get(sortedStr[i]).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
