/**
 * b20
 */
public class b20 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                ++count;
                System.out.printf("%02d ", count);
            }
            System.out.println();
        }
    }

}

