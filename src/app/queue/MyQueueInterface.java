package app.queue;

public interface MyQueueInterface {

    MyQueueResponse add(int item);

    MyQueueResponse remove();

}
