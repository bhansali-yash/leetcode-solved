/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        if(target<peak) return binarySearch( target,  mountainArr, true, 0 , peak);
        else return binarySearch( target,  mountainArr, false, peak, mountainArr.length());
    }

    public int binarySearch(int target, MountainArray mountainArr, boolean isAsc, int s, int e) {
        while(s<=e){
            int m=s+(e-s)/2;
            if(mountainArr.get(m)==target) return m;
            else if(mountainArr.get(m)<target){
                if(isAsc) s=m+1;
                else e=m-1;
            }
            else {
                if(isAsc) e=m-1;
                else s=m+1;
            }
        }
        return -1;
    }

    public int findPeak(MountainArray mountainArr){
        int s=0, e=mountainArr.length();
        while(s<=e){
            int m=s+(e-s)/2;
            if(s==e) return s;
            else if(mountainArr.get(m)<mountainArr.get(m+1)) s=m+1;
            else e=m-1;
        }
        return s;
    }
}