class Solution {
    public boolean isPalindrome(String s) {
        
         if(s.length() == 1){
        return true; 
    }
    
    ArrayList<Character> list = new ArrayList<>(); 
    
    for(int i = 0; i< s.length(); i++){
        if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
            list.add(s.charAt(i));
        }
    }
    
    int start = 0; 
    int end = list.size()-1; 
    
    while(start < end){
        if((Character.toLowerCase(list.get(start)) 
                != Character.toLowerCase(list.get(end)))){
            return false;
        }
        start ++;
        end --; 
    }
    
    return true; 
    }
}
