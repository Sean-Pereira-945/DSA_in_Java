class Solution {
    public int maxArea(int[] height) {
        int left = 0; 
        int right = height.length -1;

        int max = 0;
        int current = 0;

        while (left < right){
            int l = right - left;
            if(height[left]< height[right]) {
                current = height[left] * l;
                if(current > max  ) max = current;   
                left++;
            }
            else{
                current = height[right] * l;
                if(current > max  ) max = current;   
                right--;
            }

        }

        return max;
    }
}