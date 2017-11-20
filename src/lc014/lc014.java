package lc014;

public class lc014 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String[] strs = {"asdf","asd","asdlghj"};
		String[] strs1 = {"aaa","aa","aaa"};
		String[] strs2 = {"","asd","asdlghj"};
		
		String result = s.longestCommonPrefix(strs1);
		System.out.println(result);
		System.out.println("done");
		
	}
}

class Solution {

	public String longestCommonPrefix(String[] strs) {
        int tmp = Integer.MAX_VALUE;
        int tmp_idx = 0;
        for (int i = 0;i < strs.length; i++){
            if (strs[i].length() < tmp){
                tmp = strs[i].length();
                tmp_idx = i;
            }
        }
        
        if (tmp == 0||strs.length == 0){
            return "";
        }
        
        Boolean flag = true;
        String st = new String(strs[tmp_idx]);
        StringBuffer sb  =  new StringBuffer();
        
        for (int i = 0; i < tmp ; i++){
            for (int j = 0 ; j < strs.length; j++){
            	flag = (st.charAt(i) == strs[j].charAt(i))&&flag; 
            }
            if (flag == true){
            	sb.append(st.charAt(i));
            }else{
            	break;
            }
        }
        return sb.toString();
    }
}