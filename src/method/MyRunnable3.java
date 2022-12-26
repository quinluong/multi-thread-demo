package method;

public class MyRunnable3 implements Runnable {

    private final MyClass myClass;
    private final String threadName;

    public MyRunnable3(MyClass myClass, String threadName) {
        this.myClass = myClass;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        myClass.method3(threadName);
    }

}
