class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            
            if (map.containsKey(curr)) {
                int pastIndex = map.get(curr);
                if (i - pastIndex <= k) {
                    return true; 
                }
            }
            
            map.put(curr, i);
        }
        
        return false;
    }
}