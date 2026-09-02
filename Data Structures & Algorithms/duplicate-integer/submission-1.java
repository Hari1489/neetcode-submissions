class Solution {
    public boolean hasDuplicate(int[] nums) {
        int x = nums.length ;
        Set num = new HashSet<Integer>();
        for (int i = 0; i < x; i++) {
            num.add(nums[i]);
        }
        if (x == num.size()) {
            return false;
        } else {
            return true;
        }
    }
}