class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                res.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}