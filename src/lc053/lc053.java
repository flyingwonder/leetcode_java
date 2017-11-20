package lc053;



public class lc053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 s = new Solution2();
		
		int[] nums = {-1,-2,5,6,0,-1,3,-7,-3,6,-76,12};
		
		System.out.println(s.maxSubArray(nums));
	}

}


class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        
        for(int i = 0 ; i<nums.length ; i++){

            int[] tmp = new int[nums.length-i];
            tmp[0] = nums[i];
            for(int j = i+1; j<nums.length ; j++){
                tmp[j-i] = tmp[j-i-1]+nums[j]; 
            }

            for(int j = 0 ; j < tmp.length ; j++){
                if(tmp[j]>result){
                    result = tmp[j];
                }
            }
        }
        return result;
    }
}

class Solution2 {  
    public static int maxSubArray(int[] A) {  
        int maxSum = Integer.MIN_VALUE;  
        int curMaxSum = 0;  
        for (int i = 0; i < A.length; ++i) {  
            curMaxSum = Math.max(curMaxSum + A[i], A[i]);  
            maxSum = Math.max(curMaxSum, maxSum);  
            System.out.print(curMaxSum+"  ");
            System.out.println(maxSum);
            
        }  
        return maxSum;  
    }  
}  