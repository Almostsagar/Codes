import java.util.Scanner;
public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double r1, r2;
        System.out.println("Enter the values of a, b, c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("Roots of the eqn are R1: " + r1 + " R2: "+ r2);
        sc.close();
    }
}
