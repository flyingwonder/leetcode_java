package lc015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class lc015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		int[] nums = {1,0,0,0,4,-1};
		System.out.println(s.threeSum(nums));
		System.out.println(s.threeSum(nums));
		
	}
}




class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList result = new ArrayList();
        
        int idx1 = 0;
        int idx2 = 0;
        int idx_h = 0;
        int idx_t = 0;
        
        Arrays.sort(nums);

        if (nums[0] > 0 || nums[nums.length-1] < 0){
            return result;
        }
        for (int i = 0 ; i < nums.length ; i++){
            if (i+1 < nums.length && nums[i+1] >= 0){
                idx1 = i;
                break;
            }
        }
        for (int i = 0 ; i <nums.length ; i++){
            if (nums.length-i-2 > -1 && nums[nums.length-i-2] <= 0){
                idx2 = nums.length-i-1;
                break;
            }
        }
        
        if(idx2-idx1 == 2){
            return result;
        }else if(idx2-idx1 > 2){
            result.add(new int[]{0,0,0});
        }else if(idx2-idx1 == 1){
            idx_h = 0;
            idx_t = nums.length-1;
            while(idx_h <= idx1 && idx_t >= idx2){
                if (nums[idx_h]+nums[idx_t] < 0){
                    idx_h++;
                }else if(nums[idx_h]+nums[idx_t] > 0){
                    idx_t--;
                }else{
                    result.add(new int[]{nums[idx_h],0,nums[idx_t]});
                    idx_h++;
                    idx_t--;
                }
            }
        }else{
            
        }
        return result;
    }
}
