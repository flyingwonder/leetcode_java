package lc020;

import java.util.Stack;


public class lc020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();

		
		Boolean result = s.isValid("()[]{p}");
		System.out.println(result);
		System.out.println("done");
	}

}
class Solution {
    public boolean isValid(String s) {
        Stack stk = new Stack();
        for (int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stk.push(c);
            }else if(stk.empty()){
                return false;
            }else if ((c == ')' && (char)stk.peek() == '(')||(c == ']' && (char)stk.peek() == '[')||(c == '}' && (char)stk.peek() == '{'))
            {
                stk.pop();
            }else{
                return false;
            }
        }
        
        if (stk.empty()){
            return true;
        }else {
            return false;
        }
        
    }
}