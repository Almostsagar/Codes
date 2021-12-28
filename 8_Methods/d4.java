public class d4 {
    static void update(int A[]){
        A[0] = 25;
    }
    public static void main(String[] args) {
        int B[] = {1,2,3,4,5};
        update(B);
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
