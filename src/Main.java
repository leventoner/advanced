import java.text.NumberFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        LambdaInterface hj = () -> System.out.println("hello");
        hj.myFunc();

        Iadd ia = (a,b) -> a + b;
        System.out.println( ia.add(10, 50));
        //comment from branch

    }

}

interface LambdaInterface {
    void myFunc();
}

interface Iadd {
    int add(int o, int c);
}
