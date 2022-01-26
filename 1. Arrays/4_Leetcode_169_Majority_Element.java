class Solution {
    public int majorityElement(int[] a) {
     
    //Moore's voting algorithm
    int count = 0;
    int current = 0;
    
    for(int i=0; i<a.length; i++){
        
        if(count == 0)
            current = a[i];
        
        if(current == a[i])
            count++;
        else
            count--;
    }
    return current; 
        
    }
}
