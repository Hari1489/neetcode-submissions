class Solution {
    public int[] getConcatenation(int[] nums) {
    
    int len = nums.length;
    int[] newArr = new int[len + len];
    System.arraycopy(nums, 0, newArr,0,len);
    System.arraycopy(nums, 0, newArr,len,len);
    return newArr;
    }
}