
class MyCircularQueue {

    final int[] cq;
    int front ;
    int rear ;
    int size ;
    int currSize = 0;
    

    public MyCircularQueue(int k) {
        cq = new int[k];
        front = 0;
        rear = 0;
        size = k ;
       
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        else{
            int rear = (front + currSize) % size;
            cq[rear] = value ;
            currSize ++;
        }
        return true ;
       
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        else{
            cq[front] = 0;
            front = (front + 1) % size;

            currSize--;
        }
        return true;
    }
    
    public int Front() {
        if(!isEmpty()){
            return cq[front];
        }
        else{
            return -1;
        }
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        else{
            return cq[ (front -1 + currSize) % size ];
        }
    }
    
    public boolean isEmpty() {
        return currSize == 0;
    }
    
    public boolean isFull() {
        return currSize == size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */