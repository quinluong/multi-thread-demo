package app.queue;

public class MyConsumer implements Runnable {

    private final MyQueueInterface queue;

    public MyConsumer(MyQueueInterface queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("//////////");

            MyQueueResponse response = queue.remove();
            System.out.println(Thread.currentThread().getId() + ", item = " + response.item + " has been removed from queue, current queue size = " + response.queueSize);

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException ex) {
            }
        }
    }

}
