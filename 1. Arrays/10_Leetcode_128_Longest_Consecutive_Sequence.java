class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        for(int val: nums)
            map.put(val,true);
        
        for(int val: nums){
            
            if(map.containsKey(val-1))
                map.put(val,false);
        }
        
        int msp; //
        int ml=0; //maximum length
        
        for(int val: nums){
            
            if(map.get(val)==true){
                
                int tl = 1; //temporary length
                int tsp = val; //temporary starting point
                
                while(map.containsKey(tsp+tl))
                    tl++;
                
                if(tl>ml)
                    ml = tl;
            }
            
        }
        
        return ml;
        
    }
}
