import java.util.Scanner;
public class c16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < C.length; k++) {
                    C[i][j] = C[i][j] + A[i][k]* B[k][j];
                }
            }
        }
        System.out.println();
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
