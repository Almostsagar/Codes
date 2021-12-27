class c1 {
    public static void main(String[] args) {

        int a[] = new int[5];
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Length of the array a is : " + a.length);

        int b[] = { 1, 2, 3, 4, 5 };
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Length of the array b is : " + b.length);
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        for (int i = b.length - 1; i >= 0; i--) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]++ + " ");            
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }
        
    }
}