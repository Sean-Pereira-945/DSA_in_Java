class Solution {
    public int[] productExceptSelf(int[] nums) {
        //HashMap <Integer, Integer> hm = new HashMap<>();
        int product = 1;
        int n = nums.length;
        int[] res = new int[n];
        int zeroes = 0;
        for(int i=0 ;i<nums.length; i++){
            if(nums[i] != 0) product = product * nums[i] ;
            if(nums[i] == 0) zeroes ++; 
        }

        for(int i=0; i<n ; i++){
            if(nums[i] == 0 && zeroes ==1) res[i] = product;
            else if (nums[i] != 0 && zeroes == 0 ) res[i] = product / nums[i];
            else if (nums[i] != 0 && zeroes > 1) res[i] = 0; 
        }
        
        return res;
    }
}