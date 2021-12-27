import java.util.Scanner;

public class c12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int B[] = new int[A.length+1];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        A = B;
        B = null;
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
