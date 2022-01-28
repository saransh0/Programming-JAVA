class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
     
         /* Sort the elements */
        Arrays.sort(nums);
 
        List<List<Integer> > pair
          = new ArrayList<>();
        TreeSet<String> set
          = new TreeSet<String>();
        List<Integer> triplets
          = new ArrayList<>();
        
        if(nums.length<4){
            return pair;
        }
 
        /* Iterate over the array from the start
        and consider it as the first element*/
        
        for(int t=0; t<nums.length-3; t++){
        
            for (int i = t+1;i < nums.length-2;i++) {
 
            
            int j = i + 1;
 
            // index of the last element
            int k = nums.length - 1;
 
            while (j < k) {
 
                if (nums[t] + nums[i] + nums[j] + nums[k] == target) {
 
                    String str = nums[t] + ":" + nums[i] + ":" + nums[j] + ":" + nums[k];
 
                    if (!set.contains(str))
                    {
 
                        // To check for the unique triplet
                        triplets.add(nums[t]);
                        triplets.add(nums[i]);
                        triplets.add(nums[j]);
                        triplets.add(nums[k]);
                        pair.add(triplets);
                        triplets = new ArrayList<>();
                        set.add(str);
                    }
 
                     // increment the second value index
                    j++;
                    
                     // decrement the third value index
                    k--;
                }
                else if (nums[t] + nums[i] + nums[j] + nums[k] < target)
                    j++;
 
                else
                    k--;
            }
        }
    }
        return pair;
       
    }
}
