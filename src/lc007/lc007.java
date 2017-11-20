package lc007;


class Solution {
    public int reverse(int x) {
        long result = 0;
        int x_abs;
        int flag;
        if (x < 0){
            x_abs = -x;
            flag = -1;
        }else if (x > 0){
            x_abs = x;
            flag = 1;
        }else{
            return 0;
        }

        int x_abs2 = x_abs;
        int counter = 0;
        while (x_abs2 > 0){
            x_abs2 = x_abs2/10;
            counter++;
        }
        
        long x_rev = 0;
        for (int i = 0 ; i < counter ; i++){
            x_rev += Math.pow(10,counter-i-1)*(x_abs-10*(x_abs/10));
            x_abs = x_abs/10;
        }
        result = flag*x_rev;
        
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }else{
            return (int) result;
        }
    }
}

class Solution2 {
    public int reverse(int x) {
    	
    	long result = 0;
    	while (x != 0){
    		result = result*10+(x%10);
    		x /= 10;
    	}
    	if (Integer.MIN_VALUE > result || result > Integer.MAX_VALUE ){
    		return 0;
    	}else{
    		return (int)result;
    	}
    	
    }
}


public class lc007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 s = new Solution2();
		int result = s.reverse(-219);
		System.out.println(result);
	}

}