public class b6 {
    public static void main(String[] args) {
        System.out.println("____________________________________");

        int a = 0b1010, b = 0b0110, c, d, e;
        c = a & b;
        d = a | b;
        e = a ^ b;
        System.out.println(c + " " + d + " " + e);







        System.out.println("____________________________________");
        int x = 0b1010, y, z,w;
        y = x >> 1;
        z = x << 1;
        w = ~x;
        System.out.println(y + " " + z + " " + w);
        // System.out.println(String.format("%s", Integer.toBinaryString(x)));
        // System.out.println(String.format("%32s", Integer.toBinaryString(y)));
    }
}
