class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();

        for(char ch:chars){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    char stackChar = stack.pop();
                    if(ch == ')' && stackChar == '(' ){
                        continue;
                    }else if(ch == '}' && stackChar == '{'){
                        continue;
                    }else if(ch == ']' && stackChar == '['){
                        continue;
                    }else{
                        return false;
                    }
                }
            }

        }

        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }
}
