import java.util.Scanner;

public class b14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1,c;
        for (int i = 1; i < n+1; i++) {
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
        }        
        sc.close(); 
    }
}
