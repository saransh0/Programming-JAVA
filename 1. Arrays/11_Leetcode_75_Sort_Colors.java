class Solution {
    public void sortColors(int[] nums) {
        
        if(nums.length<=1){
            
            return; 
        }
        
        int zero = 0;
        int one = 0;
        int two = 0;
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i]==0){
                
                zero++;
            }
            else if(nums[i]==1){
                
                one++;
            }
            else if(nums[i]==2){
                
                two++;
            }
        }
        
        System.out.println(zero + " " + one + " " + two);
        for(int i=0; i<zero; i++){
            
            nums[i]=0;
        }
        
        for(int i=zero; i<zero+one; i++){
            
            nums[i]=1;
        }
        
        for(int i=zero + one; i<zero + one+two; i++){
            
            nums[i]=2;
        }
        
    }
}
