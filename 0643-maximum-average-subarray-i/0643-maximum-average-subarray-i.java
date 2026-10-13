class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double curr = 0;
        double maxSum = 0;

        for(int i=0; i<k; i++){
            curr += nums[i];
        }

        maxSum = curr;

        for(int i=k; i<nums.length; i++){

            curr += nums[i] - nums[i-k];

            if(curr > maxSum ) maxSum = curr;
            
        }

        double maxAvg = maxSum / k;
        return maxAvg;
    }
}