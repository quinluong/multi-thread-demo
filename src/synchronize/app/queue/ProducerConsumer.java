package synchronize.app.queue;

public class ProducerConsumer {

    public static void main(String[] args) {
//        MyQueueInterface queue = new MyBlockingQueue1(10);
        MyQueueInterface queue = new MyBlockingQueue2(10);

        new Thread(new MyProducer(queue)).start();

        new Thread(new MyConsumer(queue)).start();
        new Thread(new MyConsumer(queue)).start();
        new Thread(new MyConsumer(queue)).start();
//        new Thread(new MyConsumer(queue)).start();
    }

}
