public class b2 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        int i = 10;
        for (System.out.println("Hello"); i >= 1; i--) {
            System.out.println(i);
        }
        
        for (int j = 10,k = 11; j >= 1; j--,k=k*2) {
            System.out.println(j + " " + k);
        }
    }
}
