class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = calc(n);

        while (fast != 1 && slow != fast) {
            slow = calc(slow);
            fast = calc(calc(fast));
        }

        return fast == 1;
    }

    private int calc(int n) {
        int res = 0;
        while (n > 0) {
            int digit = n % 10;
            res += digit * digit;
            n /= 10;
        }
        return res;
    }
}