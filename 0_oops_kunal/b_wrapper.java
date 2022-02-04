public class b_wrapper {
    public static void main(String[] args) {
        for (int index = 0; index < 10000000; index++) {
            A obj = new A("s");
        }
    }
}

class A {
    final int num = 10;
    String name;

    A(String s) {
        this.name = s;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obect is removed");
    }
}