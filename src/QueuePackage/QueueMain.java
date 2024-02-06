package QueuePackage;

public class QueueMain {
    public static void main(String[] args) throws QueueException {

        CustomeQueue queue = new CustomeQueue(5);


        queue.insert(25);
        queue.insert(10);
        queue.insert(20);
        queue.insert(50);
        queue.insert(29);
        queue.insert(90);


        queue.display();

        System.out.println(queue.remove());

        queue.display();


    }

}
