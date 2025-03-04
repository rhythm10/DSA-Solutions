class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            if(ch == ')') {
                if(!stack.isEmpty()) {
                    char comp = stack.pop();
                    if(comp != '(') {
                        return false;
                    }
                }
            }
            if(ch == ']') {
                if(!stack.isEmpty()) {
                    char comp = stack.pop();
                    if(comp != '[') {
                        return false;
                    }
                }
            }
            if(ch == '}') {
                if(!stack.isEmpty()) {
                    char comp = stack.pop();
                    if(comp != '{') {
                        return false;
                    }
                }
            }
        }

        if(stack.isEmpty()) {
            return true;
        }

        return false;
    }
}