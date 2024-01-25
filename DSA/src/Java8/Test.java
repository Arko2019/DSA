package Java8;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer,String> function=(k)->"response:"+k;
        TestInterface test = (a) -> {
            System.out.println("the value::" + a);
        };
        test.test(60);
        System.out.println(test.show(40));
        System.out.println(function.apply(900));


    }
}
