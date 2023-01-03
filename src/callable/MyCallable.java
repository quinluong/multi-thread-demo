package callable;

import general.Util;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    private final String threadName;

    public MyCallable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public Integer call() throws Exception {
        int randomNumber = Util.getRandomNumber(0, 100);
        System.out.println("threadName = " + threadName + ", randomNumber = " + randomNumber);
        return randomNumber;
    }

}
