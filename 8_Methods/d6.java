import java.util.Scanner;
// parameter passing
public class d6 {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int c = add(a,b);
    //     System.err.println(c);
    //     sc.close();
    // }
    // static int add(int x,int y){
    //     int sum;
    //     sum = x + y;
    //     return sum;
    // }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        namewelcome(name);
        sc.close();
    }
    static void namewelcome(String s){
        System.out.println("Welcome " + s);
    }
}
