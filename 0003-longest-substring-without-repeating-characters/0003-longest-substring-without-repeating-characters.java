class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        char[] arr = s.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i< s.length(); i++){       
            int curr = 0;
            for (int j = i; j < s.length(); j++) {
                if (hs.add(arr[j])) curr++;
                else break;                  
            }
            max = Math.max(max, curr);
            hs.clear();
        }

        return max;

    }
}