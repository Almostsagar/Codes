public class d5 {
    void change(int A[], int index, int ele){
        A[index] = ele;
    }
    public static void main(String[] args) {
        int A[] = {2,4,6,8,10};
        d5 n = new d5();
        n.change(A,4,9);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
            
        }
    }
}
