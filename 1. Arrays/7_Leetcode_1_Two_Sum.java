class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<=nums.length;i++){
            
            int temp = target - nums[i];
            
            if(map.containsKey(temp)){
                ans[1] = i;
                ans[0] = map.get(temp);
                return ans;
            }
            
            map.put(nums[i],i);
        }
        
        return ans;
        
      
        
    }
}

//Added a single line comment to see the changes
