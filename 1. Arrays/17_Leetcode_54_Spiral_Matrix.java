class Solution {
    public List<Integer> spiralOrder(int[][] A) {
        
    int T,B,L,R,dir;
    T=0; //top
    B=A.length-1; //bottom
    L=0;//left
    R=A[0].length-1; //right
    dir=0; //direction 0: left to right, 1: top to bottom, 2: right to left, 3: bottom to top
    int i;
    List<Integer>ans = new ArrayList<>();
    
    while(T<=B && L<=R)
    {
        if(dir==0)
        {
            for(i=L;i<=R;i++)
                ans.add(A[T][i]);
            T++;
        }
        else if(dir==1)
        {
            for(i=T;i<=B;i++)
                ans.add(A[i][R]);
            R--;
        }
        else if(dir==2)
        {
            for(i=R;i>=L;i--)
                ans.add(A[B][i]);
            B--;
        }
        else if(dir==3)
        {
            for(i=B;i>=T;i--)
                ans.add(A[i][L]);
            L++;
        }
        dir=(dir+1)%4;
    }
    return ans;
    }
}
