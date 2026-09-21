// Remove Duplicates from Sorted array, in-place, return new ending point

class RemoveDuplicates{
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}