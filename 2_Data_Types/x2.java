import java.util.Scanner;
public class x2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        byte a1 = 10;
        byte a2 = 0b1010;
        byte a3 = 012;
        byte a4 = 0XE;
        long a5 = 695_125_744_152L;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(Integer.toBinaryString(5));
        sc.close();
    }
}
