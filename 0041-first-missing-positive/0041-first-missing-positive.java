class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] <= 0 || nums[i]>nums.length) {
                i++;
            } else {
                int correct = nums[i] - 1;
                if (nums[i] == nums[correct])
                    i++;
                else {
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
            }
        }
        for (int j = 1; j <= nums.length; j++) {
            if (nums[j-1] != j)
                return j;
        }
        return nums.length+1;
    }
}