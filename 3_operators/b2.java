import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the b and h of the triange");
        float b = sc.nextFloat(), h = sc.nextFloat();
        float area = b * h / 2;
        System.out.println("area is:" + area);
        sc.close();
    }
}
