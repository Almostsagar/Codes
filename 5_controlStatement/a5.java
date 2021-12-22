import java.util.Scanner;
public class a5 {
    public static void main(String[] args) {
        System.out.println("Enter man's age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18 && age <=55) {
            System.out.println("The man is young");
        } else{
            System.out.println("The man is not young");
        }
        sc.close();
    }
}
