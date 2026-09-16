class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result= new int[temperatures.length];
        for(int current=0; current<temperatures.length;current++){
            while(!stack.isEmpty() && temperatures[current] > temperatures[stack.peek()]){
                int index = stack.pop();
                result[index] = current - index;
            }
            stack.push(current);
        }

        return result;
    }
}
