package block;

public class SynchronizeBlock {

    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
//        System.out.println("");
//        new Thread(new MyRunnable1(myClass1, "Thread 1")).start();
//        new Thread(new MyRunnable2(myClass1, "Thread 2")).start();
//        new Thread(new MyRunnable1(myClass1, "Thread 3")).start();
//        new Thread(new MyRunnable2(myClass1, "Thread 4")).start();
//        System.out.println("");
        new Thread(new MyRunnable3(myClass1, "Thread 1")).start();
        new Thread(new MyRunnable4(myClass1, "Thread 2")).start();
//        new Thread(new MyRunnable3(myClass1, "Thread 3")).start();
//        new Thread(new MyRunnable4(myClass1, "Thread 4")).start();
//        System.out.println("");

    }
}
