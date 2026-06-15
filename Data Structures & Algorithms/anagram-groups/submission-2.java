class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {

            char[] arr = str.toCharArray();
            Arrays.sort(arr);

            String sortedString = new String(arr);

            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }

            map.get(sortedString).add(str);
        }

        return new ArrayList<>(map.values());
    }
}