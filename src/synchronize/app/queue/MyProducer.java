package synchronize.app.queue;

import java.util.Random;

public class MyProducer implements Runnable {

    private final MyQueueInterface queue;
    private final Random random;

    public MyProducer(MyQueueInterface queue) {
        this.queue = queue;
        this.random = new Random();
    }

    private int getRandomNumber(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("//////////");

            int item = getRandomNumber(1, 1_000);
            MyQueueResponse response = queue.add(item);
            System.out.println(Thread.currentThread().getId() + ", item = " + item + " has been added to queue, current queue size = " + response.queueSize);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
    }

}
