class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true ;
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(s1).reverse().toString();
        if(reverse.equals(s1)) return true ;
        else return false;
    }
}