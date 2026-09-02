class Solution {
    public int majorityElement(int[] nums) {


       Map<Integer,Integer> frequencyMap  = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i],0) + 1);
       }

        int max = Integer.MIN_VALUE;
        int value =0 ;
       for(Map.Entry<Integer,Integer> entry:frequencyMap.entrySet()){
        if(max < entry.getValue()){
            max=entry.getValue();
            value = entry.getKey();
        }
       }

       return Integer.valueOf(value);

       

    }
}