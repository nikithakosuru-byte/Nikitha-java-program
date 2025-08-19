class Queue {
    int maxSize = 5; 
    int queue[] = new int[maxSize];
    int front = 0, rear = -1, count = 0;
    
    void enqueue(int data) {
        if (count == maxSize) {
            System.out.println("Queue Overflow");
        } else {
            rear = (rear + 1) % maxSize;
            queue[rear] = data;
            count++;
            System.out.println(data + " added to queue");
        }
    }
    
    void dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front] + " removed from queue");
            front = (front + 1) % maxSize;
            count--;
        }
    }
    
    void peek() {
        if (count == 0) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Front element is: " + queue[front]);
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.peek();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue(); 
    }
}
