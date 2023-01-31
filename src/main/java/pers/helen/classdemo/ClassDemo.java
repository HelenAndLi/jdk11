package pers.helen.classdemo;

public class ClassDemo {

    public static void main(String[] args){
//        Class c1 = int.class;
//        Class<Integer> c2 = int.class;
//
//        c1 = Integer.class;
//        c2 = Integer.class;
//
//        c1 = Double.class;
//        c2 = Double.class;
//
//        Class<Number> c3 = Integer.class;

        Class<?> c4 = int.class;
        c4 = Double.class;

        Class<? extends Number> c5 = Integer.class;
        c5 = Double.class;
        c5 = Number.class;
    }
}

