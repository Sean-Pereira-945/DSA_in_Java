class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int l = needle.length();
        int pos = -1;
        char[] arr = haystack.toCharArray();
        char[] ned = needle.toCharArray();
        int p1 = 0;
        int p2 = 0;

        while(p1<n && p2<l && n>=l){
            if(arr[p1] == ned[p2] ){
                if(p2 == 0) {
                    pos = p1;
                }
                p1++;
                p2++;
                if (p2 == l) {
                    return pos;
                }
            }else{
                if (pos != -1) {
                    p1 = pos + 1; 
                    pos = -1;
                } else {
                    p1++;
                }
                p2 = 0;
            }
            
        }
        return -1;
    }
}