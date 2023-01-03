package synchronize.block;

public class MyClass {

    private final Object object3;
    private final Object object4;

    public MyClass() {
        object3 = new Object();
        object4 = new Object();
    }

    public void method1(String threadName) {
        System.out.println(threadName + ", METHOD 1, Preload");

        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ", METHOD 1: " + i);

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
        }

        System.out.println(threadName + ", METHOD 1, End");
    }

    public void method2(String threadName) {
        System.out.println(threadName + ", METHOD 2, Preload");

        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ", METHOD 2: " + i);

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
        }

        System.out.println(threadName + ", METHOD 2, End");
    }

    public void method3(String threadName) {
        System.out.println(threadName + ", METHOD 3, Preload");

        synchronized (object3) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ", METHOD 3: " + i);

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
        }

        System.out.println(threadName + ", METHOD 3, End");
    }

    public void method4(String threadName) {
        System.out.println(threadName + ", METHOD 4, Preload");

        synchronized (object4) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + ", METHOD 4: " + i);

                try {
                    Thread.sleep(300);
                } catch (InterruptedException ex) {
                }
            }
        }

        System.out.println(threadName + ", METHOD 4, End");
    }

}
