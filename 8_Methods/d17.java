public class d17 {
    public static void main(String[] args) {

        fun1(5);
        fun2(5);
    }

    static void fun1(int a) {
        if (a > 0) {
            System.out.println(a);
            fun1(a - 1);
        }
    }

    static void fun2(int a) {
        if (a > 0) {
            fun2(a - 1);
            System.out.println(a);
        }
    }
}
