class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int target = 0;

        for(int i =0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        for( Map.Entry<Integer, Integer> entry : map.entrySet() ){
            if(entry.getValue().equals(1)){
                target = entry.getKey();
                break;
            }
        }
        return target;
    }
}