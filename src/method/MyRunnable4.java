package method;

public class MyRunnable4 implements Runnable {

    private final MyClass myClass;
    private final String threadName;

    public MyRunnable4(MyClass myClass, String threadName) {
        this.myClass = myClass;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        myClass.method4(threadName);
    }

}
