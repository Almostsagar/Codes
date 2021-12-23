import java.util.Scanner;

public class b12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.print(a + " ");            
            a = a + d;
        }        
        sc.close();
    }
}
