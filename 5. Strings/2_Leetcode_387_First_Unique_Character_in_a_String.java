class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<>();
        int j=0;
        
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
        
        char store;
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(hm.containsKey(ch)){
                
                int freq = hm.get(ch);
                if(freq == 1){
                    store = ch;
                   for(int k=0; k<s.length(); k++){
                       char temp = s.charAt(k);
                       if(store==temp){
                           return k;
                       }
                   } 
                }
            }
            
        }
        
        
        
        return -1;
        
    }
}
