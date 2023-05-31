public class Stack {
    //Instance variables
    private int[] data;
    private int top;		//Index of the top
    //constructor
    public Stack() {
        data = new int[5];
        top = 0;
    }
    public Stack(int size) {
        data = new int[size];
        top = 0;
    }
    public Stack(int[] array) {
        data = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            data[i] = array[i];
        }
        top = array.length;
    }
    public boolean isFull() {
        return top == data.length;
    }
    public boolean isEmpty() {
        return top == 0;
    }
    //add n to top of stack
    public void push(int n) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        data[top] = n;
        top++;
    }
    //look at the top item
    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return data[top-1];
    }
    //removing items from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        top--;
        return data[top];
    }
    //number of items in stack
    public int size() {
        return top;
    }


    //Display all the items in stack
    public String toString() {
        String info = "Stack: ";
        for(int i = 0; i < top; i++) {
            info += data[i] + " ";
        }
        return info;
    }
    public void makeEmpty() {
        top = 0;
    }
    public String reverseStack() {
        String reversedStack = "";
        for (int i = 0; i < top; i++) {
            reversedStack = data[i] + " " + reversedStack;
        }
        return reversedStack;
    }
}
