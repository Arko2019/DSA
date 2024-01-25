package Java8;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    static List<Integer> memozation=new ArrayList<>();
    public static Integer calculate(Integer input){
        if(input ==0){
            return 1;
        }else {
            if(memozation.size()>=input){
                System.out.println("Get From Cache::"+input);
                return memozation.get(input-1);
            }
            System.out.println("calculate Input: "+input);
            int s= input * calculate(input-1);
            memozation.add(s);
            System.out.println("cal s::"+s);
            return  s;
        }
    }

    public static void main(String[] args) {
        System.out.println("Factroil of 2");
        System.out.println(calculate(2));
        System.out.println("Factroil of 4");
        System.out.println(calculate(4));
        System.out.println("factrial of 5");
        System.out.println(calculate(5));
    }
}
