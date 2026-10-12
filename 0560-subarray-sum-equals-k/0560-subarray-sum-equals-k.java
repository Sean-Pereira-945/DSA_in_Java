class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum =0;


        HashMap <Integer , Integer> hp = new HashMap<>();
        hp.put(0,1);
        for(int i : nums){

            sum += i;
            count += hp.getOrDefault(sum - k, 0);    
            hp.put(sum , hp.getOrDefault(sum , 0)+1);



        }
        return count;
    }
}