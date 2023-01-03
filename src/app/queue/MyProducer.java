package app.queue;

import general.Util;

public class MyProducer implements Runnable {

    private final MyQueueInterface queue;

    public MyProducer(MyQueueInterface queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("//////////");

            int item = Util.getRandomNumber(1, 1_000);
            MyQueueResponse response = queue.add(item);
            System.out.println(Thread.currentThread().getId() + ", item = " + item + " has been added to queue, current queue size = " + response.queueSize);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
    }

}
