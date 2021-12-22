import java.util.Scanner;

public class a12 {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in words : ");
        String option = sc.nextLine();
        switch (option) {
            case "ADD": int add = num1 + num2;
                        System.out.println("Addition is : " + add);               
                        break;
            case "SUB": int sub = num1 - num2;
                        System.out.println("Subtraction is : " + sub);                   
                        break;
            case "MUL": int mul = num1 * num2;
                        System.out.println("Multi is : " + mul);              
                        break;
            case "DIV": int div = num1 / num2;
                        System.out.println("Division is : " + div);            
                        break;
            default:
                break;
        }
        sc.close();
    }
}
