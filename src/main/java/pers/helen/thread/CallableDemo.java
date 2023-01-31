package pers.helen.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException{
//        FutureTask<String> futureTask = new FutureTask<>(new Callable1());
//        Thread thread  = new Thread(futureTask);
//        Thread thread2  = new Thread(futureTask);
//        thread.start();
//        thread2.start();
//        System.out.println(futureTask.get());
//        System.out.println(futureTask.get());
//        System.out.println(futureTask.get());
//        System.out.println(futureTask.get());

//        FutureTask<String> futureTask1 = new FutureTask<>(new Callable1());
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(new Callable1());
        System.out.println(future.get());

//        FutureTask<String> futureTask1 = new FutureTask<>(new Callable1());
//        futureTask1.run();
//        System.out.println(futureTask1.get());

    }
}
