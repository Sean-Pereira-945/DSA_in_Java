class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;
        int merged[] = new int[m+n];
        int length = n+m;
        int pos = 0;
        int k =0;
        int l = 0;
        double median = 1.0;
        while (k<n && l<m){
            if(nums1[k]<nums2[l]){
                merged[pos] = nums1[k];
                pos++;
                k++;
            }
            else{
                merged[pos] = nums2[l];
                pos++;
                l++;
            }
        }

        while (l<m){
         
                merged[pos] = nums2[l];
                pos++;
                l++;
            
        }

        while(k<n){
           
                merged[pos] = nums1[k];
                pos++;
                k++;
               
        }

        if (length % 2 == 0){
            int middle1 = length /2;
            int middle2 = length/2 -1;
            median = (merged[middle1] + merged[middle2])/2.0;
        }
        if (length %2 != 0){
            int middle = length/2;
            
            median = merged[middle];
        }   

        return median ;


    }
}