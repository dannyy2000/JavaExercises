package QueuePackage;

public class CustomeQueue {

    protected int [] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;


    public CustomeQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomeQueue(int defaultSize) {
        this.data = new int[DEFAULT_SIZE];
    }

    public boolean insert(int item) throws QueueException {

        if(isFull()){
            throw new QueueException("Queue is full");
        }

        data[end++] = item;
        return true;

    }

    private boolean isFull() {
        return end == data.length;
    }

    public int remove() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Cannot remove from empty queue");
        }

        int removed = data[0];

        for (int i = 1; i < end; i++) {

            data[i-1] = data[i];

        }
        end--;
        return removed;
    }

    private boolean isEmpty() {
        return end == 0;
    }

    public int front() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Cannot remove from empty queue");
        }

        return data[0];
    }

    public void display(){
        for (int i = 0; i < end ; i++) {

            System.out.print(data[i] + "->");

        }
        System.out.println("END");
    }


}
