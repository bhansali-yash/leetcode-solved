class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans []= {0,0};
        for(int i=0;i<=nums.length-2;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                int sum = nums[i]+nums[j];
                if(sum==target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}