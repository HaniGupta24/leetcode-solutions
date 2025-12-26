class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int count = 1; // index for placing unique elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
