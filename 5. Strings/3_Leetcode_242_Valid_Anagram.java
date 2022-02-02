class Solution {
    public boolean isAnagram(String s, String t) {
        
                if(t.length() < s.length()){
                    return false;
                }
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                
                int of = hm.get(ch);
                of++;
                hm.put(ch,of);
            }else{
                
                hm.put(ch,1);
            }
        }
        

        for(int i=0; i<t.length(); i++){
            
            char ch = t.charAt(i);
            
            if(hm.containsKey(ch)){
                
                int freq = hm.get(ch);
                
                if(freq<=0){
                    
                    return false;
                }
                
                freq--;
                hm.put(ch,freq);
                
            }else{
                
                return false;
            }
        }
        
        return true;
    }
}
