import java.util.Scanner;

public class c10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int B[] = new int[5];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        for (int i : B) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
