public class Main {
    public static void main(String[] args) {
       int no=986;
       int num=0;
       while(no!=0){
           int a=no%10;
           num=num*10+a;
           no=no/10;
       }
        System.out.println(num);
    }
}