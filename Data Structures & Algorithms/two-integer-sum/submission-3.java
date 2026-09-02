class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int remainder = 0;
        int[] targetArr = new int[2];
        for(int i =0;i< nums.length;i++){
            remainder = target - nums[i] ;
            if(map.containsKey(remainder)){
                targetArr[1] = i;
                targetArr[0] = map.get(remainder);
            }
            map.put(nums[i], i);
        }
        return targetArr;
    }
}
