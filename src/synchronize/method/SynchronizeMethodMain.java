package synchronize.method;

public class SynchronizeMethodMain {

    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
//        System.out.println("");
        new Thread(new MyRunnable1(myClass1, "Thread 1")).start();
        new Thread(new MyRunnable2(myClass1, "Thread 2")).start();
//        new Thread(new MyRunnable1(myClass1, "Thread 3")).start();
//        new Thread(new MyRunnable2(myClass1, "Thread 4")).start();
//        new Thread(new MyRunnable1(myClass1, "Thread 5")).start();
//        new Thread(new MyRunnable2(myClass1, "Thread 6")).start();
//        new Thread(new MyRunnable1NonSynchronized(myClass1, "Thread 7")).start();
//        new Thread(new MyRunnable1NonSynchronized(myClass1, "Thread 8")).start();
//        new Thread(new MyRunnable1NonSynchronized(myClass1, "Thread 9")).start();
//        System.out.println("");
//        new Thread(new MyRunnable3(myClass1, "Thread 1")).start();
//        new Thread(new MyRunnable4(myClass1, "Thread 2")).start();
//        new Thread(new MyRunnable3(myClass1, "Thread 3")).start();
//        new Thread(new MyRunnable4(myClass1, "Thread 4")).start();
//        new Thread(new MyRunnable3(myClass1, "Thread 5")).start();
//        new Thread(new MyRunnable4(myClass1, "Thread 6")).start();
//        System.out.println("");

//        MyClass myClass2 = new MyClass();
//        System.out.println("");
//        new Thread(new MyRunnable1(myClass2, "Thread 1")).start();
//        new Thread(new MyRunnable2(myClass2, "Thread 2")).start();
    }
}
