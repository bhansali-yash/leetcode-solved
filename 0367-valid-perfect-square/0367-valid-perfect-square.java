class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num==1) return true;
        int s=1,e=num;
        while(s<=e){
            int m = s+(e-s)/2;
            long square = (long) m * m;
            if (square == num) return true;
            else if (square < num) s = m + 1;
            else e = m - 1;
        }
        return false;
    }
}