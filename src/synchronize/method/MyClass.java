package synchronize.method;

import java.util.concurrent.locks.ReentrantLock;

public class MyClass {

    private final ReentrantLock lockMethod3;
    private final ReentrantLock lockMethod4;

    public MyClass() {
        lockMethod3 = new ReentrantLock();
        lockMethod4 = new ReentrantLock();
    }

    public synchronized void method1(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ", METHOD 1: " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void method1NonSynchronized(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ", METHOD 1 non synchronized: " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
    }

    public synchronized void method2(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ", METHOD 2: " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
    }

    public void method3(String threadName) {
        lockMethod3.lock();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ", METHOD 3: " + i);

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
        } finally {
            lockMethod3.unlock();
        }
    }

    public void method4(String threadName) {
        lockMethod4.lock();
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ", METHOD 4: " + i);

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
        } finally {
            lockMethod4.unlock();
        }
    }

}
