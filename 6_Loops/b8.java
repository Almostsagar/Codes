import java.util.Scanner;

public class b8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = num;
        int rem, sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }
        if (sum == m) {
            System.out.println("arm");
        } else {
            System.out.println("not");
        }
        sc.close();
    }
}
