public class d10 {
    public static void main(String[] args) {
        System.out.println(max(2, 8, 6));
        System.out.println(max(5.8f, 5.9f));
    }

    static int max(int a, int b, int c) {
        return a > b && a > c ? a : b > c ? b : c;
    }    
    static int max(int a, int b) {
        return a > b? a : b;
    }    
    static float max(float a, float b) {
        return a > b? a : b;
    }
}
