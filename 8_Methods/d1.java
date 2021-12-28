import java.util.Scanner;

public class d1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 15, b = 10, c;
        c = max(a,b);
        System.out.println(c);
        sc.close();
    }
    static int max(int x, int y){
        x++;
        if(x>y)
            return x;
         else
            return y;
        
    }
}
