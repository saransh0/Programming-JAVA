class MyStack {

    Queue q1  = new LinkedList();
    Queue q2 = new LinkedList();

    public void push(int x) {
	    if(!q2.isEmpty())
		    q2.add(x);
	    else
		    q1.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
	    if(!q2.isEmpty()){
		    while(q2.size()>1){
        	    q1.add(q2.poll());
            }
            q2.poll();
	    }
	    else{
		    while(q1.size()>1){
        	    q2.add(q1.poll());
            }
            q1.poll();
	    }
		
    
    }

    // Get the top element.
    public  int top() {
	    int e = 0 ;
        if(!q2.isEmpty()){
    	
    	    while(q2.size()>1){
         	    q1.add(q2.poll());
    	    }
    	    e = (int) q2.poll();
    	    q1.add(e);
        }
        else
        {
    	
    	    while(q1.size()>1){
          	    q2.add(q1.poll());
    	    }
     	    e = (int) q1.poll();
     	    q2.add(e);
        }
	    return e;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        if(q1.isEmpty()&&q2.isEmpty()) return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
