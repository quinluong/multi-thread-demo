package staticmethod;

public class MyRunnable2 implements Runnable {

    private final MyClass myClass;
    private final String threadName;

    public MyRunnable2(MyClass myClass, String threadName) {
        this.myClass = myClass;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        MyClass.method2(threadName);
    }

}
