package lc058;


public class lc058 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int result = s.lengthOfLastWord("   day");
		System.out.println(result);	
	}

}

class Solution {
    public int lengthOfLastWord(String s) {
        
        int idx_f = -1;
        int idx_h = -1;
        
        for (int i = s.length()-1 ; i >= 0 ; i--){
        	if(s.charAt(i) != ' '){
        		idx_f = i;
                break;
        	}
        }

        System.out.println(idx_f);
        if (idx_f == -1){
        	return 0;
        }
        
        for (int i = idx_f ; i >= 0; i--){
            if(i == 0||s.charAt(i-1) == ' '){
                idx_h = i-1;
                break;
            }
        }
        System.out.println(idx_h);
        
        return idx_f-idx_h;
    }
}












class Solution2 {
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int idx_h = -1;
        int idx_f = s1.length()-1;
        if (idx_f == -1) return 0;
        
        for (int i = idx_f ; i >= 0; i--){
            if(i == 0||s1.charAt(i-1) == ' '){
                idx_h = i-1;
                break;
            }
        }
        System.out.println(idx_h);
        
        return idx_f-idx_h;
    }
}