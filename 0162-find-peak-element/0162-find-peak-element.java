class Solution {
    public int findPeakElement(int[] arr) {
        int s=0, e=arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(s==e) return m;
            else if(arr[m+1]>arr[m]) s=m+1;
            else e=m;
        }
        return -1;
    }
}