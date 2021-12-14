import java.util.Scanner;

public class b3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float s;
        double area;
        System.out.println("Enter the 3 sides of the triangles:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        s = (a + b + c) / 2f;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area is: " + area);
        sc.close();
    }
}
