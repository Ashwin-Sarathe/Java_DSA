package Binary_Search;
// All elements are appearing 2 times except one, which is appearing only once, find it.

class SingleElement {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;
        int n = nums.length;
        while (l <= h) {
            int mid = (l + h) / 2;
            if ((mid == 0) || (mid == n - 1) || (nums[mid - 1] != nums[mid] && nums[mid + 1] != nums[mid]))
                return nums[mid];
            else if (nums[mid - 1] == nums[mid]) {
                if (mid % 2 == 0)
                    h = mid - 1;
                else
                    l = mid + 1;
            } else {
                if (mid % 2 == 0)
                    l = mid + 1;
                else
                    h = mid - 1;
            }
        }
        return 0;
    }
}