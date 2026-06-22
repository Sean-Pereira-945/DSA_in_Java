class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indx1 = 0;
        int indx2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
               

                if (nums[i] + nums[j] == target) {
                    indx1 = i;
                    indx2 = j;
                }
            }
        }
        int result[] = new int[2];
        result[0] = indx1;
        result[1] = indx2;
        return(result);
    }
}