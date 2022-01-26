class Solution {
    public int maxProduct(int[] nums) {
        
     //reference
     //https://leetcode.com/problems/maximum-product-subarray/discuss/1608862/JAVA-or-3-Solutions-or-Detailed-Explanation-Using-Image
        
        
        int n = nums.length;
        int l=1,r=1;
        int ans=nums[0];
        
        for(int i=0;i<n;i++){
            
			//if any of l or r become 0 then update it to 1
            l = l==0 ? 1 : l;
            r = r==0 ? 1 : r;
            
            l *= nums[i];   //prefix product
            r *= nums[n-1-i];    //suffix product
            
            ans = Math.max(ans,Math.max(l,r));
            
        }
        
        return ans;
        
        //brute force method
        /*int product = Integer.MIN_VALUE;
        int temp = 1;
        for(int i=0; i<nums.length; i++){
                
            for(int j=i; j<nums.length; j++){
                
                temp = temp * nums[j];
                System.out.println(temp);
                if(temp>product)
                    product = temp;
            }
            
            System.out.println("\n\n");
            
            temp = 1;
        }
        
        return product;*/
    }
}
