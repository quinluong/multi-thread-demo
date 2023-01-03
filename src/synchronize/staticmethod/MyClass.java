package synchronize.staticmethod;

public class MyClass {

    public MyClass() {
    }

    public static synchronized void method1(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ", METHOD 1: " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
    }

    public static void method1NonSynchronized(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ", METHOD 1 non synchronized: " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
    }

    public static synchronized void method2(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ", METHOD 2: " + i);

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
            }
        }
    }

}
