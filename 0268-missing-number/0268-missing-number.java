class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i <= nums.length - 1) {
            int correct = nums[i];
            if (nums[i] == nums.length)
                i++;
            else if (nums[i] == nums[correct])
                i++;
            else {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0; j<nums.length;j++){
            if(nums[j]!=j) return j;
        }
        return nums.length;
    }
}