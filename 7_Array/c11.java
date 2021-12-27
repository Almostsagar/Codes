import java.util.Scanner;

public class c11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[5];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int B[] = new int[5];
        for (int i = A.length-1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }
        for (int i : B) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
