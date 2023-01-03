package synchronize.staticmethod;

public class MyRunnable1NonSynchronized implements Runnable {

    private final MyClass myClass;
    private final String threadName;

    public MyRunnable1NonSynchronized(MyClass myClass, String threadName) {
        this.myClass = myClass;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        MyClass.method1NonSynchronized(threadName);
    }

}
