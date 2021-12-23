import java.util.Scanner;

public class b10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = num;
        int rem, rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (m == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
        sc.close();
    }
}
