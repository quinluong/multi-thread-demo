package app.queue;

public class MyQueueResponse {

    public Integer item;
    public int queueSize;

    public MyQueueResponse(Integer item, int queueSize) {
        this.item = item;
        this.queueSize = queueSize;
    }

    public MyQueueResponse(int queueSize) {
        this.queueSize = queueSize;
    }

}
