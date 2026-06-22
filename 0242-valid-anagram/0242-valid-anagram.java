class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hp = new HashMap<>();
        boolean anagram = true;
        for(int i=0; i<s.length(); i++){
            hp.put(s.charAt(i), hp.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i=0; i<t.length(); i++){
            hp.put(t.charAt(i), hp.getOrDefault(t.charAt(i), 0) -1);
            
        }

        for(char ch : hp.keySet()){
            if(hp.get(ch) != 0) {
                anagram = false ;
                break;
            } 
               
            
        }
        return anagram;
    }
}