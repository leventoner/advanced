public class GenericTest<T, K, M> {

    private T val1;
    private M[] val2;

    private GenericTest(M[] val2) {
        this.val2 = val2;
    }

    private GenericTest(T val1) {
        this.val1 = val1;
    }

    public static void main(String[] args) {

        GenericTest<String,String,Double> g1 = new GenericTest<>("jbbhhb");
        GenericTest g2 = new GenericTest("levent");
        GenericTest g3 = new GenericTest(new Double[]{1.00, 2.00, 3.00});

        System.out.println(g1.val1);
        System.out.println(g2.val1);
        System.out.println(g3.val2[1]);





    }


}
