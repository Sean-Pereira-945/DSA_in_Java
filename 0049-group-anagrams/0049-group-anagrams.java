class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String st = new String(ch);
            if(!map.containsKey(st)){
                ArrayList <String> strings = new ArrayList<>();
                strings.add(str);
                map.put(st, strings);
            }
            else{
                map.get(st).add(str);
            }

        }

        List<List <String>> values = new ArrayList<>(map.values());
        return values;
    }
}