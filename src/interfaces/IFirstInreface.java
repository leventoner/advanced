package interfaces;

public interface IFirstInreface<T> {
    default void add(int a, int b) {
        System.out.println(a - b);
    }


    int myMethod();
}
