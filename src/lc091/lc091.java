package lc091;

import java.util.Arrays;


public class lc091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		Solution2 s2 = new Solution2();
		
		String str = "1";
		System.out.println(s.numDecodings(str));
		System.out.println(s2.numDecodings(str));

	}
}

class Solution {
    public int numDecodings(String s) {
        int[] arr = new int[s.length()+1];
        
        for(int i = 0 ; i <= s.length(); i++){
            if(i == 0){
                arr[0] = 0;     
            }else if(i == 1){
                int tmp1 = s.charAt(s.length()-i)-'0';
                arr[1] = tmp1 < 1 || tmp1 > 9? 0:1;
            }else if(i == 2){
                int tmp2 = (s.charAt(s.length()-i)-'0')*10+(s.charAt(s.length()-i+1)-'0');
                if (tmp2 <10){
                    arr[2] = 0;
                }else{
                    arr[2] = tmp2 > 26? arr[1]:arr[1]+1;
                }
            }else{                
            	int tmp3 = (s.charAt(s.length()-i)-'0')*10+(s.charAt(s.length()-i+1)-'0');
                if(tmp3 < 10){
                    arr[i] = 0;
                }else{
                    arr[i] = tmp3 > 26?arr[i-1]:arr[i-1]+arr[i-2];
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[s.length()];
    }
}

class Solution2 {
    public int numDecodings(String s) {
        int f1 = 0;
        int f2 = 0;
        for(int i = 1 ; i < s.length()+1; i++){
        	System.out.print(f1);
        	System.out.print(f2);
        	System.out.println();
        	
        	if(i == 1){
                int tmp1 = s.charAt(s.length()-i)-'0';
                f1 = tmp1 < 1 || tmp1 > 9? 0:1;
                f2 = f1;
            }else if(i == 2){
                int tmp2 = (s.charAt(s.length()-i)-'0')*10+(s.charAt(s.length()-i+1)-'0');
                if (tmp2 < 10) {
                	f2 = 0;
                }else{
                	f2 = tmp2 > 26? f1:f1+1;
                }
            }else{
            	int tmp3 = (s.charAt(s.length()-i)-'0')*10+(s.charAt(s.length()-i+1)-'0');
                if(tmp3 < 10){
                	f1 = f2;
                	f2 = 0;
                }else{
                    int tmp = f2;
                	f2 = tmp3 > 26?f2:f2+f1;
                    f1 = tmp;
                }
            }
        }
        return f2;
    }
}