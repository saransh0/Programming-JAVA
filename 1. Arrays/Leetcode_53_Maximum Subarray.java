class Solution {
    public int maxSubArray(int[] nums) {
        
        int cur_sum = nums[0]; // current sum
        int max_sum = nums[0]; // overall max sum 
        
        for(int i=1; i<nums.length; i++){
            
            if(cur_sum>=0){
                
                cur_sum += nums[i]; //if it's positive then add into current subarray
            }else{
                
                cur_sum = nums[i]; // if it's negative then start new subarray
            }
            
            if(cur_sum>max_sum)
                max_sum = cur_sum;
            
        }
        
        return max_sum;
        
        //BRUTE FORCE METHOD
        /*
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(maxsum<sum){
                    maxsum = sum;
                }
            }
            sum=0;
        }
        return maxsum;
        */
    }
}
