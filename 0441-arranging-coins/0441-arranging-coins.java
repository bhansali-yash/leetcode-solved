class Solution {
    public int arrangeCoins(int n) {
        int s=0, e=n, ans = 0;
        while (s <= e) {
        long m = s + (e - s) / 2;  // Store as long to avoid overflow
        long prod = m * (m + 1) / 2;  // Prevent overflow by dividing early

        if (prod <= n) {  
            ans = (int) m;  // Store the largest valid m
            s = (int) m + 1;
        } else {
            e = (int) m - 1;
        }
    }
        return ans;
    }
}