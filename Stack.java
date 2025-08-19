class Stack {
    int maxSize = 5;
    int stack[] = new int[maxSize];
    int top = -1;

    void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = data;
            System.out.println(data + " pushed into stack");
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped from stack");
        }
    }
    void peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.peek();
        s.pop();
        s.pop();
        s.pop();
        s.pop(); // extra pop to show underflow
    }
}
