import java.util.*;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, b, h;
        double area, vol;
        System.out.println("Enter the values of l, b, h");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        area = 2 * (l * b + b * h + h * l);
        vol = l * b * h;
        System.out.println("Area of cuboid: " + area + " Volume of cuboid: " + vol);
        sc.close();
    }
}
