class MinStack {
    Deque<Integer> stack;
    Deque<Integer> minStack;
    public MinStack() {
        stack = new ArrayDeque<Integer>();
        minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);
        Integer minNum = minStack.peek();
        if(minNum == null){
        minStack.push(val);
        }else{
            minStack.push(Math.min(val, minNum));
        }
         

    }

    public void pop() {
        int popNum;
        if (!stack.isEmpty()) {
            popNum = stack.pop();
            if (!minStack.isEmpty()) {
                    minStack.pop();
                }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
