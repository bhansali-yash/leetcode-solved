class Solution {
    public int splitArray(int[] nums, int k) {
		int maxSol = Arrays.stream(nums).sum();
		int minSol = Arrays.stream(nums).max().orElseThrow(null);
		int s = minSol, e = maxSol;
		while (s < e) {
			int m = s + (e - s) / 2;
			int pieces = 1, sum = 0;
			for (int num : nums) {
				if (sum + num > m) {
					pieces++;
					sum = num;
				} else {
					sum = sum + num;
				}
			}
			if (pieces > k)
				s = m + 1;
			else
				e = m;

		}
		return s;
    }
}