import java.util.Scanner;

public class c13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B[][] = new int[3][3];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        // Using normal for loop
        // for (int i = 0; i < B.length; i++) {
        //     for (int j = 0; j < B[0].length; j++) {
        //         System.out.print(B[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // Using foreach loop
        for (int x[] : B) {
            for (int y : x) {
                System.out.println(y);
            }           
        }
        sc.close();
    }
}
