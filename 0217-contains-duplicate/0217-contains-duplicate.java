class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        boolean isDuplicate = false;
        HashSet <Integer> hs = new HashSet<>();
        for(int i : nums){
            if(!hs.add(i)){
                isDuplicate = true;
            }
        }
        return isDuplicate;
    
    }
}