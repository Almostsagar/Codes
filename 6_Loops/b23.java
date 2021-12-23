public class b23 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
                for (int j2 = 1; j2 <= i-1; j2++) {
                    System.out.printf("* ");
                }
            System.out.println();
        }
    }
}
