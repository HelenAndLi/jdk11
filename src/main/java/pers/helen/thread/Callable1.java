package pers.helen.thread;

import java.util.concurrent.Callable;

public class Callable1 implements Callable<String> {

    @Override
    public String call(){
        System.out.println(this.getClass().getSimpleName()+" enter...");
        return "hello";
    }
}
