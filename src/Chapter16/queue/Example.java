package Chapter16.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example {
    public static void main(String[] args) {
        Queue<String> fillingStation = new PriorityQueue<>();
        fillingStation.offer("Toyota");
        fillingStation.offer("Honda");
        fillingStation.offer("Lambo");
    }
}
