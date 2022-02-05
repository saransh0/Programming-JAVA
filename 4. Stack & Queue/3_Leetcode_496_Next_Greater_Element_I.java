class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
         HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<nums2.length; i++){
            hm.put(nums2[i], i);
        }
        
        Stack<Integer> stack = new Stack<>();
        int next;
        for(int i=0; i<nums1.length; i++){
            next = -1;
            int index = hm.get(nums1[i]);
           for(int j=index+1; j<nums2.length; j++){
	               if(nums1[i] < nums2[j]){
	                next = nums2[j];
	                break;
	            }
        }
            stack.push(next);
        }
        int[] ans = new int[nums1.length];
        int j=stack.size()-1;
        while(!stack.isEmpty()){
            ans[j] = stack.pop();
            j--;
        }
        return ans;
    }
}
