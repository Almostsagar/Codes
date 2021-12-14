import java.util.*;

class keyboardInput {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 2 nos");
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("output is " + c);
        sc.close();
    }
}