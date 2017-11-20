package lc013;

import java.util.HashMap;

public class lc013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int result = s.romanToInt("MCMLXXXIV");
		System.out.println(result);
	}

}
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        StringBuffer sb = new StringBuffer(s);
        
        int flag = 1;
        int result = hm.get(sb.charAt(sb.length()-1));
        char c1,c2;
        for (int i = 0; i < s.length()-1; i++){
            c1 = sb.charAt(sb.length()-2);
            c2 = sb.charAt(sb.length()-1);
            if (hm.get(c1) < hm.get(c2)){
                flag = -1;
            }else{
                flag = 1;
            }
            result += flag*hm.get(c1);
            sb.delete(sb.length()-1,sb.length());
            System.out.println(result);
        }
        return result;
    }
}