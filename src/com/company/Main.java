package com.company;

@FunctionalInterface
interface MyFunc {
    int apply(int x);
}

@FunctionalInterface
interface Predicate{
    boolean test(int x);
}

public class Main {


    public static void main(String[] args) {

        /*
        MyFunc doubleMe = new MyFunc() {
            @Override
            public int apply(int x) {
                return x * x;
            }
        };

        MyFunc divideMe = new MyFunc() {
            @Override
            public int apply(int x) {
                return x / 2;
            }
        };
        useInterface(doubleMe,10);
        useInterface(divideMe,10);

         */

        MyFunc squared = x -> x * x;
        MyFunc squared = x -> x / 2;
        useInterface(doubleMe, 10);
        useInterface(divideMe, 10);
        useInterface(x -> x + x, 10);

        usePredicate(x -> x<10,5);


    }

    private static void usePredicate(Predicate predicate, int x){
        boolean result = predicate.test(x);
        System.out.println(result);
    }

    private static void useInterface(MyFunc myFunc, int x) {
        int result = myFunc.apply(x);
        System.out.println(result);
    }


}
