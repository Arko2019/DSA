package Java8;

import java.util.HashSet;
import java.util.Set;

public class SquareOfElement {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();

        int []a={2,1,2,3,4,7};
int []result=squareOfArray(a);
       for(int i=0;i<result.length;i++){
           System.out.print(result[i]+" ");
       }
    }
    public static int[] squareOfArray(int []a){
        int []result=new int[a.length];
        for(int i=0;i<a.length;i++){
            result[i]=a[i]*a[i];
        }
        return result;
    }
}
