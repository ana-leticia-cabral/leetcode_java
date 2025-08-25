class Solution {
    public int searchInsert(int[] nums, int target) {
        if (Arrays.binarySearch(nums, target) > - 1){
            return Arrays.binarySearch(nums, target);
        } else {
            nums = Arrays.copyOf(nums, nums.length + 1);
            nums[nums.length - 1] = target;
            Arrays.sort(nums);
            return Arrays.binarySearch(nums, target);
        }
}
}