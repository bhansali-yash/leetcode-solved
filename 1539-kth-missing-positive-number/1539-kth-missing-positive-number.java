class Solution {
    public int findKthPositive(int[] arr, int k) {
		int i = 0;
		while (k > 0) {
			i++;
			boolean findNum = binarySearch(arr, i);
			if (!findNum) {
				k--;
			}
		}
		return i;
	}

	public boolean binarySearch(int[] arr, int target) {
		int s = 0, e = arr.length - 1;
		while (s <= e) {
			int m = s + (e - s) / 2;
			if (arr[m] == target)
				return true;
			else if (arr[m] > target)
				e = m - 1;
			else
				s = m + 1;
		}
		return false;
	}
}