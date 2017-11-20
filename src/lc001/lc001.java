package lc001;

import java.util.Arrays;

public class lc001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
		int[] nums = {2,3,4,5};
		System.out.println(s.twoSum(nums, 6)[0]);
		System.out.println(s.twoSum(nums, 6)[1]);
	}

}

class Solution {
    
    public static class Node implements Comparable<Node>{
        int val;
        int idx;
        public Node(){
            
        }
        
        public Node(int val,int idx){
            this.val = val;
            this.idx = idx;
        }

        public int compareTo(Node node){
            return this.val - node.val;
        }
    }

    public int[] twoSum(int[] nums, int target) {
        
        Node[] tmp = new Node[nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            tmp[i] = new Node(nums[i],i);
        }
        Arrays.sort(tmp);
         
        int idx_h = 0;
        int idx_f = nums.length-1;
        int[] result = new int[2];
        
        while(idx_h < idx_f){
            if(tmp[idx_h].val + tmp[idx_f].val == target){
                result[0] = tmp[idx_h].idx;
                result[1] = tmp[idx_f].idx;
                break;
            }else if(tmp[idx_h].val + tmp[idx_f].val < target){
                idx_h++;
            }else if(tmp[idx_h].val + tmp[idx_f].val > target){
                idx_f--;
            }else{
                
            }
        }
        return result;
    }
}