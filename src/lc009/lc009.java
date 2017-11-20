package lc009;

public class lc009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s = new Solution();
		System.out.println(s.isPalindrome(1111));
	}
}

class Solution {
    public boolean isPalindrome(int x) {
        int x2 = x;
        long x_rev = 0;
        while(x2 > 0){
            x_rev = x_rev*10+(x2%10);
            x2 /= 10;
        }
        
        if(x_rev == x){
            return true;    
        }else{
            return false;
        }
    }
}