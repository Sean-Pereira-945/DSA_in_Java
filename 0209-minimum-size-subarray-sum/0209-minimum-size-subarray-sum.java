class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curr = 0;
        int minLen = Integer.MAX_VALUE;
        int l = 0;
        for(int i=0; i<nums.length; i++){

            curr += nums[i];

            while(curr >= target){
                minLen = Math.min(minLen, i - l + 1);
                curr -= nums[l];
                l++;
            }

        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;

    }
}