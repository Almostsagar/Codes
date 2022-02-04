import java.util.Scanner;

public class d9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        d9 ref = new d9();
        System.out.println(ref.gcd(8,8));
        sc.close();
    }
    int gcd(int a,int b){
        while (a!=b) {
            if (a>b) {
                a = a -b;
            } else {
                b = b -a;
            }
        }
        return a;
    }
}
