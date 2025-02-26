class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1) return nums[0] == target ? 0 : -1;

        int pivot = findPivot(nums);
        System.out.println("Pivot: " + pivot);

        // If pivot is -1, it means the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // Check if the pivot itself is the target
        if (nums[pivot] == target) return pivot;

        // Search in the left and right parts of the array
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    int binarySearch(int[] nums, int target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) return m;
            else if (nums[m] < target) s = m + 1;
            else e = m - 1;
        }
        return -1;
    }

     int findPivot(int[] nums) {
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m < e && nums[m] > nums[m + 1]) return m;
            if (m > s && nums[m] < nums[m - 1]) return m - 1;

            if (nums[m] >= nums[s]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1; // No rotation found
    }
}