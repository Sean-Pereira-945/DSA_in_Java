class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] p = s.toCharArray();
        char[] q = t.toCharArray();
        int pos = 0;
        int  i=0;
        
        while(pos < p.length && i < q.length){
               
            if(p[pos] == q[i]){
                pos++;
                i++;
               
            }
            else{
                //pos = 0;
                i++;
                
            }
            
        }
        if(pos == p.length) return true ;
        if(p.length == 0) return true ;
        return false;
    }
}