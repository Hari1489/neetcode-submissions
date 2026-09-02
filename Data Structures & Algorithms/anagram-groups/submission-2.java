class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> frequencyCount = new HashMap<>();
        
        for(String name:strs){
            char[] ch = name.toCharArray();
            Arrays.sort(ch);
            String find = new String(ch);
            frequencyCount.putIfAbsent(find,new ArrayList<>());
            frequencyCount.get(find).add(name);
            
        }

        // Set<Map.Entry<String,List<String>>> entries = frequencyCount.entrySet();
        // for(Map.Entry<String,List<String>> entry:entries){
        //     listCount.add(entry.getValue());
        // }

        return new ArrayList<>(frequencyCount.values());
        
    }
}
