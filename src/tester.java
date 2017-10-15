import interfaces.IFirstInreface;

public class tester<T> implements IFirstInreface<T> {

    T val1;


    public static void main(String[] args) {
        tester<Integer> t = new tester();
        t.add(10, 5);
        System.out.println(t.myMethod());

        t.val1 = 10;

    }

    public int myMethod() {
        return 10;
    }

}
