class MyQueue {
    Stack<Integer> i;
    Stack<Integer> o;
    
    public MyQueue() {
        i = new Stack<>();
        o = new Stack<>();
    }
    
    public void push(int x) {
        i.push(x);
    }
    
    public int pop() {
        if(o.isEmpty()){
            while(!i.isEmpty()){
                o.push(i.pop());
            }
        }
        return o.pop();
    }
    
    public int peek() {
        if(o.isEmpty()){
            while(!i.isEmpty()){
                o.push(i.pop());
            }
        }
        return o.peek();
    }
    
    public boolean empty() {
        if(o.isEmpty() && i.isEmpty()) return true;
        return false ;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */