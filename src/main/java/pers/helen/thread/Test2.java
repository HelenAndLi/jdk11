package pers.helen.thread;

public class Test2 implements Test1{
    public void t2(){
        System.out.println("I'm t2.");
    }

    @Override
    public void test(){
        System.out.println("I'm test2.");
    }
}
