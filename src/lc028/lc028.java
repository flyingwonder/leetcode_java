package lc028;

public class lc028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int result = s.strStr("mississipt", "sip");
		System.out.println(result);
	}

}

class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() == 0){
        	return 0;
        }
        
        int i = 0;
        for(int j = 0; j < haystack.length(); j++){
        	if ((needle.charAt(i)==haystack.charAt(j))&&(haystack.length()-j >= needle.length()-i)){
                i++;
            }else{
                j -= i;
                i = 0;
            }
            
            if (i == needle.length()){
                return j-i+1;
            }
        }
        return -1;
    }
}