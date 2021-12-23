import java.util.Scanner;

public class b7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem;
        int i=0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            System.out.println(rem);
            i = i + 1;
        }
        System.out.println(i);
        sc.close();
    }
}
