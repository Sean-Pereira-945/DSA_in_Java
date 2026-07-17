class Solution {
    public int thirdMax(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            hs.add(nums[i]);
            
        }
        int [] res = new int[hs.size()];
        int j =0 ;
        for (int num : hs){
            res[j] = num;
            j++;
        }

        Arrays.sort(res);
        if(res.length >= 3){
            return res[res.length - 3];
        }
        return res[res.length - 1];
    }
}