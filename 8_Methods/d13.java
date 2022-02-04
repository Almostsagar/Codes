public class d13 {
    public static void main(String[] args) {
        show();
        show(10);
        show(10,20);
        show(new int[] {10,12,15});
    }

    boolean validate(int a) {
        return a >= 3 && a <= 15;
    }    
    boolean validate(String name) {
        return name.matches("[A-Za-z\\s]");
    }
    static void show(int ...x){ // int x[]
        for (int i : x) {
            System.out.println(i);
        }
    }
}
