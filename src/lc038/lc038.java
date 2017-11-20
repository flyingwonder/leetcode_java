package lc038;

public class lc038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String result = s.countAndSay(4);
		System.out.println(result);	
	}
}

class Solution {
    public String countAndSay(int n) {
        StringBuffer sb = new StringBuffer("1");


        for (int i = 0 ; i < n-1 ; i++){
            int count = 1;
            int len = sb.length();
            for (int j = 1 ;j < len+1;j++){
            	if((j == len)||(sb.charAt(j)!=sb.charAt(j-1))){
                    sb.append(count);
                    sb.append(sb.charAt(j-1));
                    count = 1;
            	}else{
                	count ++;
                }
            }
            sb.delete(0,len);
        }
        return sb.toString();
    }
}