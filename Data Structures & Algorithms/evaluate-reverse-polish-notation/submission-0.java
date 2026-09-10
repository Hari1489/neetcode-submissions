class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s:tokens){
            if( s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int result =0;
                int right = stack.pop();
                int left = stack.pop();
                switch(s){
                    case "+":
                        result = left + right;
                        break;
                    case "-":
                        result = left - right;
                        break;
                    case "*":
                        result = left * right;
                        break;
                    case "/":
                        result = left / right;
                        break;    
                }
                stack.push(result);
            }else{
                stack.push(Integer.parseInt(s));
            }

        }
        return stack.pop();
        
    }
}
