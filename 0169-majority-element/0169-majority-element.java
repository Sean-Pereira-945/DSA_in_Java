class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int val : nums){
            hm.put(val, hm.getOrDefault(val,0)+1);

            if(hm.get(val) > nums.length/2){
                return val;
            }
        }
            
        
        return -1;
    }
}