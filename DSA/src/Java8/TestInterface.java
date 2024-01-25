package Java8;
@FunctionalInterface
public interface TestInterface {
    void test(int a);
    default int  show(int a){
        return a+10;
    }
}
