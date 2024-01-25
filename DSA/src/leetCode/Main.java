package leetCode;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer,Integer>fun=a->a+a;
        System.out.println(show(10).apply(20));
    }
    static Function<Integer,Integer>  show(int a){
        return b->b+a;
    }
}