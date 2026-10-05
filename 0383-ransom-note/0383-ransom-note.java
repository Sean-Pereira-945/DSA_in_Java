class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character , Integer> hp = new HashMap<>();
        
        if(ransomNote.length() > magazine.length()) return false ;
        
        for(int i=0; i<ransomNote.length(); i++){

            hp.put(ransomNote.charAt(i), hp.getOrDefault(ransomNote.charAt(i),0) +1);

        }

        for(int i=0; i<magazine.length(); i++){

            if(hp.containsKey(magazine.charAt(i))){ 
                hp.put(magazine.charAt(i), hp.get(magazine.charAt(i)) - 1);
            }
        }

        for(Character ch : hp.keySet()){

            if(hp.get(ch) > 0) return false ;

        }

        return true;
    }
}