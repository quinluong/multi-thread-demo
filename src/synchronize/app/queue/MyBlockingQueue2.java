package synchronize.app.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue2 implements MyQueueInterface {

    private final int capacity;
    private final Deque<Integer> queue;
    private final Lock lock;
    private final Condition queueFullCondition;
    private final Condition queueEmptyCondition;

    public MyBlockingQueue2(int capacity) {
        this.capacity = capacity;
        queue = new ArrayDeque(capacity);
        lock = new ReentrantLock();
        queueFullCondition = lock.newCondition();
        queueEmptyCondition = lock.newCondition();

        System.out.println("init queue with capacity = " + capacity);
    }

    @Override
    public MyQueueResponse add(int item) {
        try {
            lock.lock();

            while (queue.size() == capacity) {
                System.out.println("queue is full");

                try {
                    queueFullCondition.await();
                } catch (InterruptedException ex) {
                }
            }

            queue.add(item);
            int queueSize = queue.size();

            queueEmptyCondition.signalAll();

            return new MyQueueResponse(queueSize);
        } finally {
            lock.unlock();
        }

    }

    @Override
    public MyQueueResponse remove() {
        try {
            lock.lock();

            while (queue.isEmpty()) {
                System.out.println("queue is empty");

                try {
                    queueEmptyCondition.await();
                } catch (InterruptedException ex) {
                }
            }

            int item = queue.remove();
            int queueSize = queue.size();

            queueFullCondition.signalAll();

            return new MyQueueResponse(item, queueSize);
        } finally {
            lock.unlock();
        }
    }

}
