package pers.helen.thread;

public class ThreadDemo {

    public static void main(String[] args){
        Thread1 thread1 = new Thread1();
        thread1.run();

        new Thread(()->System.out.println("a thread.")).run();
    }
}
