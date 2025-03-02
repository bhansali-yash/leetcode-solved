class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]==nums[correct]) i++;
            else {
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0; j<nums.length; j++){
            if((j+1)!=nums[j]) ans.add(j+1);
        }
        return ans;
    }
}