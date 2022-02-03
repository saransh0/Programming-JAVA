class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.equals(""))
            return 0;
        
        if(haystack.contains(needle)==false)
            return -1;
        
        int haystackLen=haystack.length();
        int needleLen=needle.length();
               
        int index=0;
        
        //System.out.println(haystack.contains(needle));
        
        for(int i=0; i<haystackLen ; i++){
            
            if(haystack.charAt(i)==needle.charAt(0)){
              
               String str=haystack.substring(i,i+needleLen);
               
                if(str.equals(needle))
                   return i;
            }
        }
        
        return -1;
    }
}
