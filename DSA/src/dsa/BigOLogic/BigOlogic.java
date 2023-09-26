package BigOLogic;

public class BigOlogic {

    void printNumberLinear(int n){// O(n)
        for(int i=0;i<n;i++){
            System.out.println(i);
        }

    }
    void printNumberSquare(int n){// O(n2)
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(j);
            }
        }

    }
    void printNumberDivideConqure(int n){// O(log(n))
       //Binary Search

    }
    void printNumberAdd(int a,int b){// O(a+b)
        for(int i=0;i<a;i++){
            System.out.println(i);
        }
        for(int j=0;j<b;j++){
            System.out.println(j);
        }
    }
    void printNumberMultiply(int a,int b){// O(a*b)
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.println(j+":"+i);
            }
        }

    }

}
