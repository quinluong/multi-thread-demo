package callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {

    public static void main(String[] args) {
        List<Future<Integer>> futureList = new ArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 10; i++) {
            Callable<Integer> callable = new MyCallable(i + "");

            Future<Integer> future = executor.submit(callable);

            futureList.add(future);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        int sum = 0;
        for (Future<Integer> future : futureList) {
            try {
                sum += future.get();
            } catch (InterruptedException | ExecutionException ex) {
            }
        }

        System.out.println("Sum = " + sum);
    }
}
