package app.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyBlockingQueue1 implements MyQueueInterface {

    private final int capacity;
    private final Deque<Integer> queue;

    public MyBlockingQueue1(int capacity) {
        this.capacity = capacity;
        queue = new ArrayDeque(capacity);
        System.out.println("init queue with capacity = " + capacity);
    }

    @Override
    public synchronized MyQueueResponse add(int item) {
        while (queue.size() == capacity) {
            System.out.println("queue is full");

            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }

        queue.add(item);
        int queueSize = queue.size();

        notifyAll();

        return new MyQueueResponse(queueSize);
    }

    @Override
    public synchronized MyQueueResponse remove() {
        while (queue.isEmpty()) {
            System.out.println("queue is empty");

            try {
                wait();
            } catch (InterruptedException ex) {
            }
        }

        int item = queue.remove();
        int queueSize = queue.size();

        notifyAll();

        return new MyQueueResponse(item, queueSize);
    }

}
