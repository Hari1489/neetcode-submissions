class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> count = new ArrayList<>();

        for(int i:nums){
            if(count.contains(i)){
                return true;
            }else{
                count.add(i);
            }
        }
        return false;
 
    }
}
