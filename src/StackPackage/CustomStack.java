package StackPackage;

public class CustomStack {

    protected int [] data;

    private static  final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }


    public CustomStack(int defaultSize) {
        this.data = new int[defaultSize];
    }

    public boolean push(int item) throws StackException {
        if(isFull()){
            throw new StackException("Stack is full");
        }
        ptr++;
        data[ptr] = item;

        return true;

    }

    public boolean isFull() {

       return ptr == data.length -1;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from empty stack");
        }

        return data[ptr--];

    }

    private boolean isEmpty(){
        return ptr == -1;
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot peak from empty stack");
        }

        return data[ptr];
    }
}
