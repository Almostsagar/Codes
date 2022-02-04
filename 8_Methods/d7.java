import java.util.Scanner;

public class d7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(primeOrNot(n));
        sc.close();
    }

    static boolean primeOrNot(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return true;
            }
        }
        return false;
    }
}
